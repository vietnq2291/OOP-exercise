import javax.swing.JOptionPane;

public class Calculator {
	public static void main(String[] args) {
		String strNum1, strNum2;
		String strSum, strDiff, strMult, strDiv, strResult;
		float num1, num2;
		
		// Get 2 numbers from user
		strNum1 = JOptionPane.showInputDialog(null, "Please enter the first number:", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
		num1 = Float.parseFloat(strNum1);
		strNum2 = JOptionPane.showInputDialog(null, "Please enter the second number:", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
		num2 = Float.parseFloat(strNum2);
		
		// Calculate +, -, *, /
		strSum  = "Sum: " + num1 + " + " + num2 + " = " + (num1 + num2);
		strDiff = "Difference: " + num1 + " - " + num2 + " = " + (num1 - num2);
		strMult = "Product: " + num1 + " x " + num2 + " = " + (num1 * num2);
		if (num2 != 0) {
			strDiv  = "Quotient: " + num1 + " : " + num2 + " = " + (num1 / num2); 
		} else {
			strDiv = "Quotient: Undefined (you should enter second number != 0)!";
		}
		strResult = strSum + "\n" + strDiff + "\n" + strMult + "\n" + strDiv;
		
		// Display result
		JOptionPane.showMessageDialog(null, strResult);
		System.exit(0);
	}
}
