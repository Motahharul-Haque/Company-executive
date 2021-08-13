package com.salezshark.admin.crud.service;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.salezshark.admin.crud.model.CompanyDetails;
import com.salezshark.admin.crud.repository.CompanyDetailsRepo;

@Service
public class CompanyDetailsService {

	private final CompanyDetailsRepo companyDetailsRepo;
	
	@Autowired
	public CompanyDetailsService(CompanyDetailsRepo companyDetailsRepo)
	{
		this.companyDetailsRepo = companyDetailsRepo;
	}

	public List<CompanyDetails> getAllCompanyDetails() {
		
		return (List<CompanyDetails>) companyDetailsRepo.findAll();
	}

	public Optional<CompanyDetails> getCompanyDetails(long id) {
		
		return companyDetailsRepo.findById(id);
	}

	public void deleteCompanyDetails(long id) {
		
		companyDetailsRepo.deleteById(id);
	}
	
    public ResponseEntity<Object> persistCompanyDetails(CompanyDetails details) {
    	CompanyDetails savedDetails = companyDetailsRepo.save(details);

    	URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
    			.buildAndExpand(savedDetails.getCompanyId()).toUri();

    	return ResponseEntity.created(location).build();
		
	}

	public ResponseEntity<Object> updateCompanyDetails(CompanyDetails details, long id) {
		Optional<CompanyDetails> companyDetailsOptional = companyDetailsRepo.findById(id);

		if (!companyDetailsOptional.isPresent())
			return ResponseEntity.notFound().build();

		details.setCompanyId(id);
		
		companyDetailsRepo.save(details);

		return ResponseEntity.noContent().build();
	}

}
