
public class StringAndStringBuffer {

	public static String concatWithString() {
		String s = "Practice";
		for (int i = 0; i < 1000; i++) {
			s = s + "java";
		}
		return s;
	}
	public static String concatWithStringBuffer() {
		StringBuffer sb = new StringBuffer("Practice");
		for (int i = 0; i < 1000; i++) {
			sb.append("java");
		}
		return sb.toString();
	}
	public static void main(){  
		long startTime = System.currentTimeMillis();  
		concatWithString();  
		System.out.println("Time taken by Concating with String: "+(System.currentTimeMillis()-startTime)+"ms"); 
		startTime = System.currentTimeMillis();  
        concatWithStringBuffer();  
        System.out.println("Time taken by Concating with  StringBuffer: "+(System.currentTimeMillis()-startTime)+"ms");  
	}
}

// The String class is immutable.	The StringBuffer class is mutable.
// String is slow and consumes more memory when we concatenate too many strings because every time it creates new instance.	
// StringBuffer is fast and consumes less memory when we concatenate t strings.
//String class is slower and StringBuffer class is faster

/*
 * When to use which one : If a string is going to remain constant throughout
 * the program, then use the String class object because a String object is
 * immutable. If a string can change (for example: lots of logic and operations
 * in the construction of the string) and will only be accessed from a single
 * thread, using a StringBuilder is good enough. If a string can change and will
 * be accessed from multiple threads, use a StringBuffer because StringBuffer is
 * synchronous, so you have thread-safety. If you don’t want thread-safety than
 * you can also go with StringBuilder class as it is not synchronized.
 */