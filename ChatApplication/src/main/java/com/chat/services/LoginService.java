package com.chat.services;

import com.chat.dto.LoginDTO;
import com.chat.exceptions.LoginException;

public interface LoginService {

	public String logIntoAccount(LoginDTO dto)throws LoginException;
	public String logOutFromAccount(String key)throws LoginException;

}
