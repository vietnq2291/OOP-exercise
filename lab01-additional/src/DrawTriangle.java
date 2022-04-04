import java.util.Scanner;

public class DrawTriangle {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		int height;
		
		// get triangle height
		System.out.println("Enter the height of triangle: ");
		height = keyboard.nextInt();
		
		for (int i = 0; i < height; i++){
			// print spaces
			for (int j = 0; j < (height - i - 1); j++) {
				System.out.print(" ");
			}
			// print stars
			for (int k = 0; k < (2*i + 1); k++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		keyboard.close();
	}
}
