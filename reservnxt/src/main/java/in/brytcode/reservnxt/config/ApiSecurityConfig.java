package in.brytcode.reservnxt.config;

import in.brytcode.reservnxt.service.CustomFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity(debug = true)
public class ApiSecurityConfig {
    @Bean
    public UserDetailsService userDetailsService(DataSource dataSource) throws Exception {
        UserDetails user = User.withDefaultPasswordEncoder()
                .username("krishna")
                .password("krishna")
                .roles("USER")
                .build();
        UserDetails user2 = User.withDefaultPasswordEncoder()
                .username("ram")
                .password("ram")
                .roles("USER", "ADMIN")
                .build();
        InMemoryUserDetailsManager userDetailsManager = new InMemoryUserDetailsManager(user);
        JdbcUserDetailsManager jdbcUserDetailsManager = new JdbcUserDetailsManager(dataSource);
        jdbcUserDetailsManager.setEnableGroups(true);
        userDetailsManager.createUser(user2);
        return jdbcUserDetailsManager;
    }
    @Bean
    PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }
    @Bean
    public SecurityFilterChain apiFilterChain(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        http.addFilterBefore(new CustomFilter(), UsernamePasswordAuthenticationFilter.class);
        http.authorizeHttpRequests(
                        (authorize) -> authorize
                                            .antMatchers("/hotels").authenticated()
                                            .antMatchers("/hotels/roomtype/**").authenticated()
                                            .antMatchers("/roomtypes").hasAuthority("PROCESS_PAYROLL")
                                            .antMatchers("/**").permitAll())
                .oauth2Login(Customizer.withDefaults())
                .httpBasic(Customizer.withDefaults())
                .formLogin(Customizer.withDefaults());
                return http.build();
    }


}
