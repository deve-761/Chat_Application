package com.chat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chat.models.CurrentUserSession;

public interface SessionRepo extends JpaRepository<CurrentUserSession, Integer>{

	public CurrentUserSession findByUuid(String uuid);

}
