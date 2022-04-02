import javax.swing.JOptionPane;

public class LinearSystem {
	public static void main(String[] args) {
		double a11, a12, b1, a21, a22, b2;
		double det, det1, det2;
		String strResult;
		
		// get input
		a11 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter a11 = "));
		a12 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter a12 = "));
		b1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter b1 = "));
		a21 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter a21 = "));
		a22 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter a22 = "));
		b2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter b2 = "));
		
		// Find solution
		det = a11 * a22 - a21 * a12;
		det1 = b1 * a22 - b2 * a12;
		det2 = a11 * b2 - a21 * b1;
		if (det != 0) {
			strResult = "an unique solution:" + "\nx1 = " + (det1 / det) 
											  + "\nx2 = " + (det2 / det);
		} else if (det == 0 && det1 == 0 && det2 == 0) {
			strResult = "infinitely many solutions";
		} else {
			strResult = "no solution.";
		}
		
		// Print result
		JOptionPane.showMessageDialog(null, "The system has" + strResult);
		System.exit(0);
	}
}
