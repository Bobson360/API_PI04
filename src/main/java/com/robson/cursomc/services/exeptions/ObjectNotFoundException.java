package com.robson.cursomc.services.exeptions;

public class ObjectNotFoundException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public ObjectNotFoundException(String args) {
		
	}
	
	 public ObjectNotFoundException(String msg, Throwable cause){
		super(msg, cause);
	}
}
