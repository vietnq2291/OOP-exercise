import java.util.Scanner;

public class DayOfMonth {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		String Month[] = {"January", "February", "March", "April",
							"May", "June", "July", "August",
							"September", "October", "November", "December"};
		int monthIndex=-1;
		int year=-1;
		
		// Get month input
		do {
			String inputMonth = keyboard.nextLine();
			for (int i = 0; i < Month.length; i++) {
				boolean test = (inputMonth.equals(Month[i]) 
								|| inputMonth.equals(Month[i].substring(0, 3)) 
								|| inputMonth.equals(Month[i].substring(0, 3) + "."));
				
				if (test){
					monthIndex = i;
					break;
				}
			}
			
			if (monthIndex == -1) {
				System.out.println("Incorrect month");
			}
		} while (monthIndex == -1);
		
		// Get year input
		while (year < 0) {
			year = keyboard.nextInt();
			
			if (year < 0) {
				System.out.println("Incorrect year");
			}
		}
	}
}
