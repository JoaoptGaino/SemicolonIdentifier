public class SemicolonIdentifier {
	public static void CheckSemiColon(String str) {
		if(str.contains(";")) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}
	public static void main(String[] args) {
		CheckSemiColon("João");
	}
}
