package exceptionHandling;

public class DefaultExceptionHandler {

	public static void main(String[] args) {
		doStuff();
	}

	private static void doStuff() {
		doMoreStuff();
		
	}

	private static void doMoreStuff() {
		System.out.println(10/0); // raises arithmetic exception and handled by default exception handler
	}

}
