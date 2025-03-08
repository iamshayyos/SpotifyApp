package spotify.rest;


public class TransactionNotFoundException extends RuntimeException {

	public TransactionNotFoundException(String message) {
		super(message);	
	}
}
