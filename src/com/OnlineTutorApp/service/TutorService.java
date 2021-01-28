package com.OnlineTutorApp.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.OnlineTutorApp.domain.Tutor;

@Repository
public interface TutorService {

	public int add(Tutor t);
	public List<Tutor> findAll();
}
