package com.chat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chat.models.Community;

public interface CommunityRepo extends JpaRepository<Community, Integer>{

}
