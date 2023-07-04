package com.chat.dto;

import com.chat.models.Community;

import lombok.Data;

@Data
public class LoginDTO {

	private String username;
	private String password;
	private Community community;
	
}
