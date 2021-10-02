
public class StringReverse {

	public static void reverse() {
		String str = "Geeks";

		// conversion from String object to StringBuffer
		StringBuffer sbr = new StringBuffer(str);
		sbr.reverse();
		System.out.println(sbr);

		// conversion from String object to StringBuilder
		StringBuilder sbl = new StringBuilder(str);
		sbl.append("ForGeeks");
		System.out.println(sbl);
	}

	public static void reverseByChar() {
		String str = "Geeks";

		int length = str.length();

		char[] chArr = str.toCharArray();

		for (int i = chArr.length - 1; i >= 0; i--) {
			System.out.println(chArr[i]);
		}
	}

	public static void reverseByCharAt() {

		String str = "Geeks";

		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.println(str.charAt(i));

		}
	}
	
	
	public static void main(String[] arg)
	{
		String s = "Welcome To Java";
		
		String[] word = s.split(" ");
		
		String reverseword = "";
		
		for(String w:word)
		{
			StringBuilder sbl = new StringBuilder(w);
			sbl.reverse();
			reverseword=reverseword+sbl.toString()+" ";
		}
		System.out.println(reverseword);
	}
}
