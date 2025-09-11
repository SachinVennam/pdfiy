package com.googledocs.Google_Docs.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "LoginController", description = "Login and Change Password endpoints")
public class LoginController {

	@Operation(summary = "Login API", description = "Validates User name and Password")
	@PostMapping("/login")
	public String login(@RequestParam("userName") String userName,@RequestParam("password") String password) {
		String response=null;
		try {
			if(userName.trim().equals("Sachin Vennam") && password.trim().equals("test@123"))
				response="Logged in Sucessfully....";
			else
				response="User Name or Password is incorrect,Please Check and try again..";
		} catch (Exception e) {
			System.out.println("error in login Method.."+e.getMessage());
			e.printStackTrace();
		}
		return response;
	}
}
