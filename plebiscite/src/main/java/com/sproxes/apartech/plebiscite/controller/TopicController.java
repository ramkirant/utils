package com.sproxes.apartech.plebiscite.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sproxes.apartech.plebiscite.entity.Topic;

@RestController
public class TopicController {

	@GetMapping(value="/topics/{id}")
	public Topic getTopic(@PathVariable String id) {
		return new Topic();
	}
	
	@PostMapping(value="/topics")
	public ResponseEntity<Topic> addTopic(@RequestBody Topic topic) {
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@PutMapping(value="/topics")
	public ResponseEntity<Topic> modifyTopic(@RequestBody Topic topic) {
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping(value="/topics/{id}")
	public ResponseEntity<Topic> deleteTopic(@PathVariable String id) {
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
