package com.example.demo.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class Form {
	@NotNull
	private int id;
	@NotBlank(message="enter a full name")
	private String username;
	
	
	@Size(min=8,message="inter a 8 digit")
	private String password;

}
