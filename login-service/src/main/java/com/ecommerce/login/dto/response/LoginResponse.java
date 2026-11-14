package com.ecommerce.login.dto.response;

public class LoginResponse {
	
	private String accessToken;
    private String refreshToken;
    private String tokenType;
    private Long expiresIn;
    private RegisterResponse user;
    
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public String getRefreshToken() {
		return refreshToken;
	}
	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}
	public String getTokenType() {
		return tokenType;
	}
	public void setTokenType(String tokenType) {
		this.tokenType = tokenType;
	}
	public Long getExpiresIn() {
		return expiresIn;
	}
	public void setExpiresIn(Long expiresIn) {
		this.expiresIn = expiresIn;
	}
	public RegisterResponse getUser() {
		return user;
	}
	public void setUser(RegisterResponse user) {
		this.user = user;
	}
    
    

}
