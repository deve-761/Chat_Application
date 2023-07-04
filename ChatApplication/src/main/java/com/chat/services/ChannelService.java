package com.chat.services;


import java.util.List;
import com.chat.exceptions.ChannelException;
import com.chat.exceptions.UserException;
import com.chat.models.Channel;

public interface ChannelService {

	public Channel createChannel(Channel channel);
	public String addUserToChannel(Integer channelId, Integer userId) throws UserException , ChannelException;
	public List<Channel> getAllChannel() throws ChannelException;

	
}
