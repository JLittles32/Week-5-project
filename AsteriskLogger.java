package week5OOPconcepts;

public class AsteriskLogger implements Logger {
	
	
	@Override
	public void Log(String message) {
		System.out.println("***" + message + "***");
		System.out.println();
	}
	

	@Override
	public void Error(String message) {
		System.out.println("*****************************");
		System.out.println("***ERROR: " + message + "***");
		System.out.println("*****************************");
		System.out.println();
	}
}
