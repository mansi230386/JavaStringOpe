package TestPackage;

public class JavaString {

	public static void main(String[] args) {
		String reverse = ReverseString();
		System.out.println(reverse);

		System.out.println(isPalindrome("nitin"));

		System.out.println(reverseWord("My name is mansi"));
		
		ConvertStringToInt1();
		ConvertStringToInt();
		
		ConvertIntToString();
		ConvertIntToString1();
	}

	public static String ReverseString() {
		String s = "My name is mansi";

		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		return sb.toString();
	}

	public static boolean isPalindrome(String str) {

		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		String reverse = sb.toString();

		if (reverse.equals(str)) {
			return true;
		} else {
			return false;
		}

	}

	public static String reverseWord(String str) {
		String words[] = str.split("\\s");
		String reverseWord = "";
		for (String w : words) {
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			reverseWord += sb.toString() + " ";
		}
		return reverseWord.trim();
	}

	public static void ConvertStringToInt() {
		// Declaring String variable
		String s = "200";
		// Converting String into int using Integer.parseInt()
		int i = Integer.parseInt(s);
		System.out.println(s + 100);// 200100, because "200"+100, here + is a string concatenation operator
		System.out.println(i + 100);// 300, because 200+100, here + is a binary plus operator
	}

	public static void ConvertStringToInt1() {
		// Declaring String variable
		String s = "200";
		// Converting String into int using Integer.parseInt()
		int i = Integer.valueOf(s);
		System.out.println(s + 100);// 200100, because "200"+100, here + is a string concatenation operator
		System.out.println(i + 100);// 300, because 200+100, here + is a binary plus operator
	}
	
	
	public static void ConvertIntToString() {
	
		Integer i = 200;
		// Converting String into int using Integer.parseInt()
		String s= String.valueOf(i);
		System.out.println(i + 100);// 200100, because "200"+100, here + is a string concatenation operator
		System.out.println(s + 100);// 300, because 200+100, here + is a binary plus operator
	}

	public static void ConvertIntToString1() {
	
		Integer i = 200;
		// Converting String into int using Integer.parseInt()
		String s= Integer.toString(i);
		System.out.println(i + 100);// 200100, because "200"+100, here + is a string concatenation operator
		System.out.println(s + 100);// 300, because 200+100, here + is a binary plus operator
	}
}
