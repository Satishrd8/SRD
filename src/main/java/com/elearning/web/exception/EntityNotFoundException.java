package com.elearning.web.exception;

@SuppressWarnings("serial")
public class EntityNotFoundException extends RuntimeException {
	
	public EntityNotFoundException(Long id) {
        super("entity not found for id '" + id + "'.");
    }
	
	public EntityNotFoundException( String message ){
		super( message );
	}

}
