package TestPackage;

public class TestClass {

	public static void main(String[] args) {
//		String s = "This is mansi";
//
//		char[] arry = s.toCharArray();
//
//		for (int i = arry.length - 1; i >= 0; i--) {
//			System.out.println(arry[i]);
//		}
		
//		String s1 = "This is mansi";
//		
//		String[] a = s1.split("//s");
//
//		String reverseword = "";
//		
//		for (int i=a.length-1;i>=0;i--)
//		{	
//			StringBuilder sb=new StringBuilder(s1);
//			sb.reverse();		
//			reverseword=reverseword+sb.toString();
//		}
//		System.out.println(reverseword);
//		
		
		String s1 = "This is java";
		
		String[] word=s1.split(" ");

		for (int i = word.length - 1; i >= 0; i--) {
			System.out.println(word[i]);
		}
	}

}
