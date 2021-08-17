package com.salezshark.admin.crud.exception;

public class ExecutiveDetailsNotFoundException extends Exception {
	private long id;

	public ExecutiveDetailsNotFoundException(long id) {
	super(String.format(" Executive Id with '%s' not found ",id));
	this.id=id;

	}

	public long getId() {
	return this.id;
	}
}
