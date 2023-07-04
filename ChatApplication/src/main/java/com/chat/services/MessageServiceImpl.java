package com.chat.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chat.exceptions.ChannelException;
import com.chat.models.Message;
import com.chat.repositories.MessageRepo;

@Service
public class MessageServiceImpl implements MessageService{

	@Autowired
	private MessageRepo msgRepo;
	
	@Override
	public String sendMessage(Message msg) {
		msgRepo.save(msg);
		return "message send";
	}

	public List<Message> getAllMessagesByChannelId(Integer chId) {
        return msgRepo.findAllByChannelId(chId);
    }

}
