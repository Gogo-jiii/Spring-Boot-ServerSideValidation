package com.example.demo.models;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class LoginData {
	
	@NotBlank(message = "Field can not be empty.")
	@Size(min = 3, max = 6, message = "Username length should be between 3 to 6 characters.")
	private String username;
	
	@NotBlank(message = "Field can not be empty.")
	@Email(regexp= "^(.+)@(\\S+)$", message = "Invalid email id.")
	private String email;
	
	@NotNull
	@AssertTrue(message = "Please agree to terms and conditions")
	private boolean agreed = true;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isAgreed() {
		return agreed;
	}
	public void setAgreed(boolean agreed) {
		this.agreed = agreed;
	}
	
	@Override
	public String toString() {
		return "LoginData [username=" + username + ", email=" + email + ", agreed=" + agreed + "]";
	}
	
}
