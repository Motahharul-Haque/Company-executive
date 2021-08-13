package com.salezshark.admin.crud.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.salezshark.admin.crud.model.CompanyDetails;

public interface CompanyDetailsRepo extends CrudRepository<CompanyDetails, Long> {


}
