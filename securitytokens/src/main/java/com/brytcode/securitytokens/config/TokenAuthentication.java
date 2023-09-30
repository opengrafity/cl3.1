package com.brytcode.securitytokens.config;

import org.springframework.security.authentication.AbstractAuthenticationToken;

public class TokenAuthentication extends AbstractAuthenticationToken {
    private final Object principal;

    public TokenAuthentication(Object principal) {
        super(null);
        this.principal = principal;
        setAuthenticated(true);
    }
    @Override
    public Object getCredentials() {
        return null;
    }

    @Override
    public Object getPrincipal() {
        return this.principal;
    }
}
