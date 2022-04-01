import javax.swing.JOptionPane;
import java.lang.Math;

public class SecondDegreeEquation {
	public static void main(String[] args) {
		double a, b, c, delta;
		String strResult;
		
		// Get input
		a = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter a (!= 0):", "Input coefficients", JOptionPane.INFORMATION_MESSAGE));
		if (a == 0) {
			JOptionPane.showMessageDialog(null, "You should try again with a != 0");
			System.exit(0);
		}
		b = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter b:", "Input coefficients", JOptionPane.INFORMATION_MESSAGE));
		c = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter c:", "Input coefficients", JOptionPane.INFORMATION_MESSAGE));
		
		// Find solution
		delta = b*b - 4*a*c;
		if (delta > 0) {
			strResult = "two distinct roots:" + "\nx1 = " + (-b + Math.sqrt(delta))/(2*a)
											  + "\nx2 = " + (-b - Math.sqrt(delta))/(2*a);
		} else if (delta == 0) {
			strResult = "double root: x = " + (-b)/(2*a);
		} else {
			strResult = "no solution";
		}
		
		// Display result
		JOptionPane.showMessageDialog(null, "The equation has " + strResult);
	}
}