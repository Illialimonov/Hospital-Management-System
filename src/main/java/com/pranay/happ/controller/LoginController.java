package com.pranay.happ.controller;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pranay.happ.dto.Response;
import com.pranay.happ.dto.UserResponseDto;
import com.pranay.happ.entity.Login;
import com.pranay.happ.entity.Role;
import com.pranay.happ.serviceI.LoginServiceI;
import com.pranay.happ.serviceI.RoleServiceI;
import com.pranay.happ.serviceIMPL.LoginServiceImpl;
//http://localhost:
@RestController
@RequestMapping(value = "/api/admin")
public class LoginController {
	
	@Autowired
	private LoginServiceI loginServiceI;
	
	@Autowired
	private LoginServiceImpl impl;

	@PostMapping(value = "/login")
	public ResponseEntity<UserResponseDto> getLoginData(@RequestBody Login login){
		System.out.println("Login Data Check : " + login);
		UserResponseDto userResponseDto = impl.getLogin(login.getEmail(), login.getPassword());
		return new ResponseEntity<UserResponseDto>(userResponseDto,HttpStatus.OK);
	}
	
	@GetMapping(value="/forgotpassword")
	public ResponseEntity<Response> forgotpassword(@RequestParam String email,@RequestParam String pass){
		Response response=loginServiceI.forgotpassword(email,pass);
		return new ResponseEntity<Response>(response,HttpStatus.OK);
	}
}





