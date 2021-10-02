package NumberOperations;

public class swapeTwoNumbers {

	public static void main(String[] args) {
		int a = 10, b = 20;

		// Using temp variable
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After swaping values are " + a + " " + b);

		// Using +/- variable
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swaping values are " + a + " " + b);

		// Using *// variable
		a = a * b;
		b = a / b;
		a = a / b;
		System.out.println("After swaping values are " + a + " " + b);
	}

}
