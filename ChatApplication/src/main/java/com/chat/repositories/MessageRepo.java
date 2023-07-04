package com.chat.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chat.models.Message;

public interface MessageRepo extends JpaRepository<Message, Integer>{

	 public List<Message> findAllByChannelId(Integer channelId);
}
