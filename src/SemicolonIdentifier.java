import javax.swing.JOptionPane;

public class SemicolonIdentifier {
	public static boolean CheckSemiColon(String str) {
		if(str.contains(";")) {
			return true;
		}else {
			return false;
		}
	}
	public static String insertSemi(String str){
		return str + ";";
	}
	public static void main(String[] args) {
		String text = JOptionPane.showInputDialog("Write something");
		
		if(CheckSemiColon(text)== true) {
			JOptionPane.showMessageDialog(null, text);
		}else {
			
			JOptionPane.showMessageDialog(null, insertSemi(text));
		}
	}
}
