package exceptionHandlingUncheckedException;

public class StudentAlreadyExistException extends Exception {

		
	String message;
	StudentAlreadyExistException(String messaege){
		this.message = message;
	} 
	
	public String getMessage() {
		return message;
	}
	
	@Override
	public String toString() {
		return "StudentAlreadyExistException [message=" + message + "]";
	}
	
	
}
