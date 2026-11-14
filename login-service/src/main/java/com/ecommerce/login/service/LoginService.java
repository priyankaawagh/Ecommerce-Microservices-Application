package com.ecommerce.login.service;

import com.ecommerce.login.dto.request.LoginRequest;
import com.ecommerce.login.dto.request.RegisterRequest;
import com.ecommerce.login.dto.response.LoginResponse;
import com.ecommerce.login.dto.response.RegisterResponse;

public interface LoginService {
	
	RegisterResponse register(RegisterRequest request);
	
	LoginResponse login(LoginRequest request);

}
