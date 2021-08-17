package com.salezshark.admin.crud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.salezshark.admin.crud.exception.ExecutiveDetailsNotFoundException;
import com.salezshark.admin.crud.model.ExecutiveDetails;
import com.salezshark.admin.crud.service.ExecutiveDetailsService;

@CrossOrigin("*")
@RestController
public class ExecutiveDetailsController {

	private final ExecutiveDetailsService executiveDetailsService;
	
	@Autowired
	public ExecutiveDetailsController(ExecutiveDetailsService executiveDetailsService)
	{
		this.executiveDetailsService = executiveDetailsService;
	}
	
	@GetMapping("/allexe")
	public List<ExecutiveDetails> getAllExecutiveDetails()
	{
		return executiveDetailsService.getAllExecutiveDetails();
	}
	
	@GetMapping("/allexe/{id}")
	public ExecutiveDetails getExecutiveDetails(@PathVariable long id) throws ExecutiveDetailsNotFoundException
	{
		Optional<ExecutiveDetails> executiveDetails = executiveDetailsService.getExecutiveDetails(id);
		
		if (!executiveDetails.isPresent())
			throw new ExecutiveDetailsNotFoundException(id);

		return executiveDetails.get();
	}
	
	@DeleteMapping("/allexe/{id}")
	public void deleteExecutiveDetails(@PathVariable long id)
	{
		executiveDetailsService.deleteExecutiveDetails(id);
	}
	
	@PostMapping("/allexe")
    public ResponseEntity < Object > persistExecutiveDetails(@RequestBody ExecutiveDetails details) {
		return executiveDetailsService.persistExecutiveDetails(details);
		
    }
	
	@PutMapping("/allexe/{id}")
	public ResponseEntity<Object> updateExecutiveDetails(@RequestBody ExecutiveDetails details, @PathVariable long id) {

		return executiveDetailsService.updateExecutiveDetails(details, id);
	}
}
