package com.brytcode.securitytokens.config;

import com.brytcode.securitytokens.filters.SimpleTokenGeneratorFilter;
import com.brytcode.securitytokens.filters.SimpleTokenValidatorFilter;
import com.nimbusds.jose.jwk.source.ImmutableJWKSet;
import com.nimbusds.jose.jwk.source.ImmutableSecret;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AuthorizeHttpRequestsConfigurer;
import org.springframework.security.config.annotation.web.configurers.oauth2.server.resource.OAuth2ResourceServerConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.oauth2.jose.jws.MacAlgorithm;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;
import org.springframework.security.oauth2.jwt.NimbusJwtEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import javax.crypto.spec.SecretKeySpec;

@Configuration
@EnableWebSecurity(debug = true)
public class ApiSecurityConfig {
    @Value("${jwt.key}")
    private String jwtKey;
    @Bean
    public InMemoryUserDetailsManager userDetailsManager(){
        return new InMemoryUserDetailsManager(
                User.withUsername("vamsi")
                        .password("{noop}krishna")
                        .authorities("ROLE_USER")
                        .build()
        );
    }

    @Bean
    public SecurityFilterChain apiSecurityFilterChain(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);

        http.authorizeHttpRequests(authoriz->{
            authoriz.antMatchers("/employee/**").authenticated()
                    .antMatchers("/gettoken/**").authenticated()
                    .antMatchers("/**").permitAll();
        })
                .oauth2ResourceServer(OAuth2ResourceServerConfigurer::jwt)
                .httpBasic(Customizer.withDefaults())
                .formLogin(Customizer.withDefaults());
        return http.build();
    }
    @Bean
    public JwtEncoder jwtEncoder(){
        return new NimbusJwtEncoder(new ImmutableSecret<>(jwtKey.getBytes()));
    }

    @Bean
    public JwtDecoder jwtDecoder(){
        byte[] bytes = jwtKey.getBytes();
        SecretKeySpec originalKey = new SecretKeySpec(bytes,"RSA");
        return NimbusJwtDecoder.withSecretKey(originalKey).macAlgorithm(MacAlgorithm.HS512).build();
    }
}
