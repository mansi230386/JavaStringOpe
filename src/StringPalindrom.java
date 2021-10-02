
public class StringPalindrom {

	public static void main(String[] args) {
		String s = "madam";
		String s1 = s;

		String rev = "";
		
		int len=s.length();

		for (int i = len - 1; i >= 0; i--) {

			rev = rev + s.charAt(i);
		}
		
		if (s1.equals(rev)) {

			System.out.println(s1 + " is palindrom string");
		} else {
			System.out.println(s1 + " is not palindrom string");
		}
	}

}
