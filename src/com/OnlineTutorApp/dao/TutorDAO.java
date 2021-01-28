package com.OnlineTutorApp.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.OnlineTutorApp.domain.Tutor;

@Repository
public interface TutorDAO {
	
	public int add(Tutor tutor);
	public List<Tutor> findAll();

}
