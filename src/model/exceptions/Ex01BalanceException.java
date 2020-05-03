package model.exceptions;

public class Ex01BalanceException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public Ex01BalanceException (String message) {
		super(message);
	}

}
