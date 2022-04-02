import javax.swing.JOptionPane;

/*JOptionPane.showConfirmDialog(
 *	Component -> null,
 *	Object -> String object,... to print,
 *	String -> title of the dialog,
 *	int -> the Option Type (DEFAULT_OPTION, YES_NO_OPTION, YES_NO_CANCEL_OPTION, OK_CANCEL_OPTION),
 *	int -> Message type (ERROR_MESSAGE, INFORMATION_MESSAGE, WARNING_MESSAGE, QUESTION_MESSAGE, PLAIN_MESSAGE),
 *	Icon -> display inside the dialog
 * )
 */
public class ChoosingOption {
	public static void main(String[] args) {
		int option1 = JOptionPane.showConfirmDialog(null, "Do you want to change to the first class ticket?");
		
		JOptionPane.showMessageDialog(null, "You've chosen: " 
				+ (option1 == JOptionPane.YES_OPTION ? "Yes":
					(option1 == JOptionPane.NO_OPTION ? "No":
					(option1 == JOptionPane.CANCEL_OPTION ? "Cancel":"Closed"))));
		
		
		// Customize options for user using showOptionDialog
		Object[] options = {"Yes, of course", "Hmm maybe??", "No", "Never, dude!"};
		int option2 = JOptionPane.showOptionDialog(null, "Do you want to change to the second class ticket?", "Change ticket", 
												JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, args);
		
		JOptionPane.showMessageDialog(null, "You've chosen: " 
				+ (option2 == 0 ? "Yes, of course":
					(option2 == 1 ? "Hmm maybe??":
					(option2 == 2 ? "No":"Never, dude!"))));
	}
}
