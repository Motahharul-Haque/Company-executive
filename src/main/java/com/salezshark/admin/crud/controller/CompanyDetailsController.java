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

import com.salezshark.admin.crud.exception.CompanyDetailsNotFoundException;
import com.salezshark.admin.crud.model.CompanyDetails;
import com.salezshark.admin.crud.service.CompanyDetailsService;

@CrossOrigin("*")
@RestController
public class CompanyDetailsController {

	private final CompanyDetailsService companyDetailsService;
	
	@Autowired
	public CompanyDetailsController(CompanyDetailsService companyDetailsService)
	{
		this.companyDetailsService = companyDetailsService;
	}
	
	@GetMapping("/allComp")
	public List<CompanyDetails> getAllCompanyDetails()
	{
		return companyDetailsService.getAllCompanyDetails();
	}
	
	@GetMapping("/allComp/{id}")
	public CompanyDetails getCompanyDetails(@PathVariable long id)
	{
		Optional<CompanyDetails> companyDetails = companyDetailsService.getCompanyDetails(id);
		
		if (!companyDetails.isPresent())
			throw new CompanyDetailsNotFoundException(id);

		return companyDetails.get();
	}
	
	@DeleteMapping("/allComp/{id}")
	public void deleteCompanyDetails(@PathVariable long id)
	{
		companyDetailsService.deleteCompanyDetails(id);
	}
	
	@PostMapping("/allComp")
    public ResponseEntity < Object > persistCompanyDetails(@RequestBody CompanyDetails details) {
		return companyDetailsService.persistCompanyDetails(details);
		
    }
	
	@PutMapping("/allComp/{id}")
	public ResponseEntity<Object> updateCompanyDetails(@RequestBody CompanyDetails details, @PathVariable long id) {

		return companyDetailsService.updateCompanyDetails(details, id);
	}
}
