package sdt.demo.exception;

public class NoSuchProductException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6834344489727416763L;

	public NoSuchProductException(String message) {
		super(message);
	}
}
