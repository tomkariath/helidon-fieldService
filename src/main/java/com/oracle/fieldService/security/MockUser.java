package com.oracle.fieldService.security;

import java.util.Collection;

import io.helidon.security.providers.httpauth.SecureUserStore;

public class MockUser implements SecureUserStore.User{
	private String login;
    private char[] password;
    private Collection<String> roles;

    public MockUser(String login, char[] password, Collection<String> roles) {
        this.login = login;
        this.password = password;
        this.roles = roles;
    }

	@Override
	public String login() {
		return this.login;
	}

	@Override
	public boolean isPasswordValid(char[] password) {
		return this.password.equals(password);
	}
	
	@Override
    public Collection<String> roles() {
        return roles;
    }
}