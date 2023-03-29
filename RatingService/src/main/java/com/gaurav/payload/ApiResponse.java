package com.gaurav.payload;

public class ApiResponse {
	private String message;
	private String HttpStatus;
	private boolean status;
	public ApiResponse() {
	    super();
	    // TODO Auto-generated constructor stub
	}
	public ApiResponse(String message, String httpStatus, boolean status) {
	    super();
	    this.message = message;
	    HttpStatus = httpStatus;
	    this.status = status;
	}
	public String getMessage() {
	    return message;
	}
	public void setMessage(String message) {
	    this.message = message;
	}
	public String getHttpStatus() {
	    return HttpStatus;
	}
	public void setHttpStatus(String httpStatus) {
	    HttpStatus = httpStatus;
	}
	public boolean isStatus() {
	    return status;
	}
	public void setStatus(boolean status) {
	    this.status = status;
	}
}
