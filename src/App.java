import week5CodingAssignment.AsteriskLogger;
import week5CodingAssignment.SpacedLogger;

public class App {

	public static void main(String[] args) {
		AsteriskLogger log1 = new AsteriskLogger(); 
		
		log1.log("At Risk");
		log1.error("So Close");
		
		SpacedLogger log2 = new SpacedLogger(); 
		
		log2.log("Spacey");
		log2.error("SpacedOut");
	
	}

}
