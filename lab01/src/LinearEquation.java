import javax.swing.JOptionPane;

public class LinearEquation {
	public static void main(String[] args) {
		String strNum1, strNum2, strResult;
		Double num1, num2;
		
		JOptionPane.showMessageDialog(null, "Welcome to First-degree equation calculator:\n"
											+ "=> Find solution of ax + b = 0 (with a != 0)", "Linear equation", JOptionPane.INFORMATION_MESSAGE);
		
		// get equation's coefficients from user
		strNum1 = JOptionPane.showInputDialog(null, "Equation: ax + b = 0\nEnter a = ", "Input coefficients", JOptionPane.INFORMATION_MESSAGE);
		num1 = Double.parseDouble(strNum1);
		strNum2 = JOptionPane.showInputDialog(null, "Equation: ax + b = 0\nEnter b = ", "Input coefficients", JOptionPane.INFORMATION_MESSAGE);
		num2 = Double.parseDouble(strNum2);
		
		// Print result
		if (num1 != 0) {
			strResult = "a unique solution: " + (-num2 / num1);
		} else if (num2 != 0) {
			strResult = "no solution!";	
		} else {
			strResult = "infinite solutions!";
		}
		JOptionPane.showMessageDialog(null, "Equation " + num1 + "x + " + num2 + " = 0 has " + strResult, "Result", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}
