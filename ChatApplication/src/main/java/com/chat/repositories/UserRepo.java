package com.chat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chat.models.User;

public interface UserRepo extends JpaRepository<User, Integer>{

	public User findByUsername(String name);
}
