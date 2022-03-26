package week5CodingAssignment;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String log) {
		System.out.println("***" + log + "***");
		
	}

	@Override
	public void error(String error) {
		String str = "***ERROR: " + error + "***";
		for (int i = 0; i < str.length(); i++) {
			System.out.print("*");
		}
			System.out.println();
		System.out.println(str);
		for (int i = 0; i < str.length(); i++) {
			System.out.print("*");
		}
			System.out.println();
	}

}