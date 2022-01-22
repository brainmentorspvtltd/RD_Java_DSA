package codes;

public class CasesDemo {

	public static void main(String[] args) {
		//int day = 2;
		//int day  = 2;
		//byte day = 2;
		//short day = 2;
		// char , String, int , byte, short these are allowed in switch case
		//long day = 2; // switch not allow long, float, double, boolean 
//		if(day == 1) {
//			System.out.println("Working Day");
//		}
//		else if(day ==2 ) {
//			System.out.println("Meeting Day");
//		}
		
		// Equality Comparsion - Switch Case
//		final int MONDAY = 1; // final is a reserved word (keyword) ,we can define constant 
//		//MONDAY ++;
//		//MONDAY = 2;
//		final int TUESDAY = 2;
		String day = "Tuesday";
		switch(day) {
		//case MONDAY:
		case "Monday":
			System.out.println("Working Day");
			break; // exit from the switch case
		case "Tuesday":
		//case TUESDAY:
			System.out.println("Meeting Day");
			break;
		case "Wednesday":
		//case 3:
			System.out.println("Demo Day");
			break;
			default:
				System.out.println("Wrong day");
		}

	}

}
