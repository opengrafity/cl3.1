package com.brytcode.securitytokens.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.jose.jws.MacAlgorithm;
import org.springframework.security.oauth2.jwt.JwsHeader;
import org.springframework.security.oauth2.jwt.JwtClaimsSet;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.security.oauth2.jwt.JwtEncoderParameters;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

@RestController
public class LoginController {
    @Autowired
    private JwtEncoder jwtEncoder;

    @GetMapping("/gettoken")
    public String login(Authentication authentication){
        return "Token"+getToken(authentication);
    }

    private String getToken(Authentication authentication){
        JwtClaimsSet claims = JwtClaimsSet
                .builder()
                .issuer("brytcode")
                .issuedAt(Instant.now())
                .expiresAt(Instant.now().plus(1, ChronoUnit.HOURS))
                .claim("username",authentication.getName())
                .build();
        JwtEncoderParameters jwtParams = JwtEncoderParameters.from(JwsHeader.with(MacAlgorithm.HS512).build(),claims);
        return this.jwtEncoder.encode(jwtParams).getTokenValue();
    }
}
