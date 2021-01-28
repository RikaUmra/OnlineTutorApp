package com.OnlineTutorApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OnlineTutorApp.dao.TutorDAO;
import com.OnlineTutorApp.domain.Tutor;

@Service
public class TutorServiceImpl {
	
	@Autowired
	private TutorDAO tutorDAO;
	
	public void setTutorDAO(TutorDAO tutorDAO) {
		this.tutorDAO = tutorDAO;
	}

	public int add(Tutor t) {
		return tutorDAO.add(t);
	}
	public List<Tutor> findAll() {
		return tutorDAO.findAll();


}
}
