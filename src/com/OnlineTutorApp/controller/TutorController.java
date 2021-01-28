package com.OnlineTutorApp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.OnlineTutorApp.domain.Tutor;
import com.OnlineTutorApp.service.TutorService;



@RestController
public class TutorController {

	
	@Autowired
	private TutorService tutorService;

			private List<Tutor> tutor = new ArrayList<Tutor>();

			@RequestMapping(value = "/tutor", method = RequestMethod.GET)
			public List<Tutor> show() {
				List<Tutor> t = new ArrayList<Tutor>();
				t = tutorService.findAll();
				return t;

			}
			
			
			
			
			/*	@RequestMapping(value = "/tutor", method = RequestMethod.POST)
			public ResponseEntity<String> add(@RequestBody Products p) {
				products.add(p);
				return new ResponseEntity<String>(HttpStatus.OK); 
				
				}
				*/

}
