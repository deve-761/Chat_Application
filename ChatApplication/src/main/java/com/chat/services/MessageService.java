package com.chat.services;

import java.util.List;

import com.chat.models.Message;

public interface MessageService {

	public String sendMessage(Message msg);
	public List<Message> getAllMessagesByChannelId(Integer chId);
}
