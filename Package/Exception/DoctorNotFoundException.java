package com.example.Exception;

public class DoctorNotFoundException extends Exception {

	public DoctorNotFoundException() {
		super();

	}

	public DoctorNotFoundException(String message, Throwable cause) {
		super(message, cause);

	}

	public DoctorNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);

	}

	public DoctorNotFoundException(String message) {
		super(message);

	}

	public DoctorNotFoundException(Throwable cause) {
		super(cause);

	}

}
