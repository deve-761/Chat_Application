package com.chat.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chat.exceptions.CommunityException;
import com.chat.exceptions.LoginException;
import com.chat.models.Community;
import com.chat.repositories.ChannelRepo;
import com.chat.repositories.CommunityRepo;
import com.chat.repositories.SessionRepo;

@Service
public class CommunityServiceImpl implements CommuntiyService{

	@Autowired
	private CommunityRepo comRepo;
	
	@Autowired
	private ChannelRepo chRepo;
	
	@Autowired
	private SessionRepo usersessiondao;
	
	@Override
	public Community createCommunity(Community community) {
		
		return comRepo.save(community);
	}

	@Override
	public List<Community> getAllCommunities() throws CommunityException {
		
		List<Community> allCommunity = comRepo.findAll();
		if(allCommunity.isEmpty()) throw new CommunityException("no community found");
		return allCommunity;
	}
	
	

}
