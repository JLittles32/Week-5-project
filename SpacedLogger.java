package week5OOPconcepts;

public class SpacedLogger implements Logger{

	@Override
	public void Log(String message) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < message.length(); i++) {
			if (i > 0) {
				result.append(" ");
			}
			result.append(message.charAt(i));
		}
		System.out.println(result.toString());
	}

	@Override
	public void Error(String message) {
		System.out.println("ERROR: ");
		Log(message);
	}

}
