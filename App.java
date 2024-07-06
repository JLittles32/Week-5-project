package week5OOPconcepts;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger asteriskLogger = new AsteriskLogger();
		Logger spacedLogger = new SpacedLogger();
		
		
		asteriskLogger.Log("Hello World");
		System.out.println();
		asteriskLogger.Error("This is an error");
		
		
		spacedLogger.Log("Hello World");
		System.out.println();
		spacedLogger.Error("This is an error");
		
	}

}
