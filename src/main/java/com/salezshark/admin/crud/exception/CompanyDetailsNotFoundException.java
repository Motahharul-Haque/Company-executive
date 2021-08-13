package com.salezshark.admin.crud.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class CompanyDetailsNotFoundException extends RuntimeException {
	
	private long id;

	public CompanyDetailsNotFoundException(long id) {
	super(String.format(" Company Id with '%s' not found ",id));
	this.id=id;

	}

	public long getId() {
	return this.id;
	}
}
