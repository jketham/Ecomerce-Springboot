package com.ecoomerce.sportscenter.model;


import lombok.Data;

@Data
public class JwtResponse {
    private String username;
    public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	private String token;
}
