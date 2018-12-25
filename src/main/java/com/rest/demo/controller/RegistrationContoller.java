package com.rest.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.demo.model.UserRegistration;
import com.rest.demo.repository.RegistrationRepository;

@RestController
@RequestMapping("/rest/registration")
public class RegistrationContoller {

	@Autowired
	RegistrationRepository regRepository;
	
	@GetMapping("/all")
	public List<UserRegistration> getAllRegistationDetails() {
		return regRepository.findAll();
	}
	
	@PostMapping("/save")
	
	public UserRegistration saveUsear(@RequestBody UserRegistration userRegistration) {
		
		return regRepository.save(userRegistration);
	}
	
	@DeleteMapping("/remove/{rid}")
	public void deleteUser(@PathVariable Integer rid)
	{
		regRepository.deleteById(rid);
	}
	
	
	@PutMapping(value="/update/{id}")
	public ResponseEntity<Object> modifyUser(@RequestBody final UserRegistration userRegistration,@PathVariable Integer id) {
		
		Optional<UserRegistration> userOptional = regRepository.findById(id);
		
		if (!userOptional.isPresent())
			
			return ResponseEntity.notFound().build();

		userRegistration.setRegistationId(id);
		
		regRepository.save(userRegistration);
		
		return ResponseEntity.noContent().build();
		
		
	}
}
