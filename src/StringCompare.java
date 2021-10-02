
public class StringCompare {

	/*
	 * The equals() method returns true if String objects are matching and both
	 * strings are of same case. equalsIgnoreCase() returns true regardless of cases
	 * of strings.
	 */
	public static void equals() {
		String s1 = "Sachin";
		String s2 = "Sachin";
		String s3 = new String("Sachin");
		String s4 = "Saurav";
		System.out.println(s1.equals(s2));// true
		System.out.println(s1.equals(s3));// true
		System.out.println(s1.equals(s4));// false
	}

	// The == operator compares references not values.
	public static void equalTo() {
		String s1 = "Sachin";
		String s2 = "Sachin";
		String s3 = new String("Sachin");
		System.out.println(s1 == s2);// true (because both refer to same instance)
		System.out.println(s1 == s3);// false(because s3 refers to instance created in nonpool)
	}

	/*
	 * The String class compareTo() method compares values lexicographically and
	 * returns an integer value that describes if first string is less than, equal
	 * to or greater than second string.
	 * 
	 * Suppose s1 and s2 are two String objects. If:
	 * 
	 * s1 == s2 : The method returns 0. s1 > s2 : The method returns a positive
	 * value. s1 < s2 : The method returns a negative value.
	 */
	public static void CompareTo() {
		String s1 = "Sachin";
		String s2 = "Sachin";
		String s3 = "Ratan";
		System.out.println(s1.compareTo(s2));// 0
		System.out.println(s1.compareTo(s3));// 1(because s1>s3)
		System.out.println(s3.compareTo(s1));// -1(because s3 < s1 )
	}
}

/*
 * There are three ways to compare String in Java:
 * 
 * By Using equals() Method By Using == Operator By compareTo() Method
 */