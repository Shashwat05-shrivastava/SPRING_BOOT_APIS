package org.shashwat.Customer.entities;

import java.time.LocalDateTime;

public class ErrorResponse {
	private int statusCode;
	private String errorMessage;
	private LocalDateTime timeStamp;
	public ErrorResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ErrorResponse(int statusCode, String errorMessage, LocalDateTime timeStamp) {
		super();
		this.statusCode = statusCode;
		this.errorMessage = errorMessage;
		this.timeStamp = timeStamp;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}
	
}
