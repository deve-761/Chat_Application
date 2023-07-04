package com.chat.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.chat.models.Channel;

public interface ChannelRepo extends JpaRepository<Channel, Integer>{

}
