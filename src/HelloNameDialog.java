import javax.swing.JOptionPane;

public class HelloNameDialog {
	public static void main(String[] args) {
		String userName;
		
		userName = JOptionPane.showInputDialog("Please enter your name:");
		JOptionPane.showMessageDialog(null, "Hello " + userName + "!");
		System.exit(0);
	}
}
