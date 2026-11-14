package com.ecommerce.login.service.impl;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecommerce.login.ENUMS.Role;
import com.ecommerce.login.dto.request.LoginRequest;
import com.ecommerce.login.dto.request.RegisterRequest;
import com.ecommerce.login.dto.response.LoginResponse;
import com.ecommerce.login.dto.response.RegisterResponse;
import com.ecommerce.login.model.Login;
import com.ecommerce.login.repository.LoginRepository;
import com.ecommerce.login.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService{
	
	private final LoginRepository loginRepository;
	
	private final PasswordEncoder passwordEncoder;
	
	public LoginServiceImpl(LoginRepository loginRepository, PasswordEncoder passwordEncoder) {
		this.loginRepository = loginRepository;
		this.passwordEncoder = passwordEncoder;
	}

	@Override
	@Transactional
	public RegisterResponse register(RegisterRequest request) {
		
		if(loginRepository.existByEmail(request.getEmail())) {
			throw new IllegalArgumentException("Email already registered");
		}
		
		Login login = Login.builder()
		.email(request.getEmail());
		.password(passwordEncoder.encode(request.getPassword()));
		.role(Role.CUSTOMER);
		.isActive(true)
		.build();
		
		
		Login savedLogin = loginRepository.save(login);
		return new RegisterResponse(
				savedLogin.getUserId();
				savedLogin.getEmail();
				"Registration Successful"
				);
				
		
	}

	@Override
	public LoginResponse login(LoginRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

}
