package com.salezshark.admin.crud.service;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.salezshark.admin.crud.model.ExecutiveDetails;
import com.salezshark.admin.crud.repository.ExecutiveDetailsRepo;

@Service
public class ExecutiveDetailsService {

private final ExecutiveDetailsRepo executiveDetailsRepo;
	
	@Autowired
	public ExecutiveDetailsService(ExecutiveDetailsRepo executiveDetailsRepo)
	{
		this.executiveDetailsRepo = executiveDetailsRepo;
	}

	public List<ExecutiveDetails> getAllExecutiveDetails() {
		
		return (List<ExecutiveDetails>) executiveDetailsRepo.findAll();
	}

	public Optional<ExecutiveDetails> getExecutiveDetails(long id) {
		
		return executiveDetailsRepo.findById(id);
	}

	public void deleteExecutiveDetails(long id) {
		
		executiveDetailsRepo.deleteById(id);
	}
	
    public ResponseEntity<Object> persistExecutiveDetails(ExecutiveDetails details) {
    	ExecutiveDetails savedDetails = executiveDetailsRepo.save(details);

    	URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
    			.buildAndExpand(savedDetails.getExecutiveId()).toUri();

    	return ResponseEntity.created(location).build();
		
	}

	public ResponseEntity<Object> updateExecutiveDetails(ExecutiveDetails details, long id) {
		Optional<ExecutiveDetails> executiveDetailsOptional = executiveDetailsRepo.findById(id);

		if (!executiveDetailsOptional.isPresent())
			return ResponseEntity.notFound().build();

		details.setExecutiveId(id);
		
		executiveDetailsRepo.save(details);

		return ResponseEntity.noContent().build();
	}

}
