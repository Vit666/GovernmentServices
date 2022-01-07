package gov.allowance.childrenallowance.exception;

public class DataRequestException extends Exception {
	public DataRequestException() {

	}

	public DataRequestException(String message) {
		super(message);
	}

	public DataRequestException(String message, Throwable cause) {
		super(message, cause);
	}

	public DataRequestException(Throwable cause) {
		super(cause);
	}
}