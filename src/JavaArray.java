//package TestPackage;
//
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.HashSet;
//import java.util.List;
//
//public class JavaArray {
//
//	public static void main(String[] args) {
//
////		sortArray();
//		// findCommonElementBetweenTwoArray();
//		// findCommonElementBetweenTwoArray1();
//		// secondLargest(new int[] { 45, 51, 28, 75, 49, 42 });
////		smallestAndLargestNumber();
////		reverseStringArray();
//	//	reverseIntegerArray();
////		double mean = findMean();
////		System.out.println(mean);
////		
////		double median = findMedian();
////		System.out.println(median);
//
//		findduplicate();
//	}
//
//
//	public static void sortArray() {
//		int[] a = new int[10];
//		int[] b = new int[100];
//
//		int[] a1 = new int[] { 45, 12, 78, 34, 89, 21 };
//		Arrays.sort(a1);
//		System.out.println(Arrays.toString(a1));
//	}
//
//	public static void findCommonElementBetweenTwoArray() {
//		String[] S1 = { "ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR" };
//		String[] S2 = { "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR" };
//
//		HashSet<String> h1 = new HashSet<>(Arrays.asList(S1));
//		HashSet<String> h2 = new HashSet<>(Arrays.asList(S2));
//		h1.retainAll(h2);
//		System.out.println(h1);
//
//	}
//
//	public static void findCommonElementBetweenTwoArray1() {
//		Integer[] S1 = { 1, 2, 3, 4, 5, 4 };
//		Integer[] S2 = { 3, 4, 5, 6, 7, 4 };
//
//		HashSet<Integer> set = new HashSet<>();
//
//		for (int i = 0; i < S1.length; i++) {
//			for (int j = 0; j < S2.length; j++) {
//				if (S1[i].equals(S2[j])) {
//					set.add(S1[i]);
//				}
//			}
//		}
//		System.out.println(set);
//
//	}
//
//	public static int secondLargest(int[] input) {
//		int firstlargest, secondlargest;
//
//		if (input[0] > input[1]) {
//			firstlargest = input[0];
//			secondlargest = input[1];
//
//		} else {
//			firstlargest = input[1];
//			secondlargest = input[0];
//		}
//		for (int i = 2; i < input.length; i++) {
//			if (input[i] > firstlargest) {
//				firstlargest = input[i];
//				secondlargest = firstlargest;
//			} else if (input[i] < firstlargest && input[i] > secondlargest) {
//				secondlargest = input[i];
//			}
//		}
//		return secondlargest;
//	}
//
//	public static void smallestAndLargestNumber() {
//		int[] inoutarray = { 10, 43, 27, 98, 75, 59, 191 };
//
//		int smallest = inoutarray[0];
//
//		int largest = inoutarray[0];
//
//		for (int number : inoutarray) {
//			if (number > largest) {
//				largest = number;
//			} else if (smallest > number) {
//				smallest = number;
//			}
//		}
//		System.out.println("Largest and Smallest numbers are " + largest + " " + smallest);
//	}
//
//	public static void reverseStringArray() {
//
//		String[] inputArray = { "India", "USA", "Germany", "Australia" };
//		// Converting Array to List
//		List<String> list = Arrays.asList(inputArray);
//		// Reversing the list using Collections.reverse() method
//		Collections.reverse(list);
//		// Converting list back to Array
//		String[] reversedArray = list.toArray(inputArray);
//		// Printing the reverse Array
//		System.out.print("Reverse Array : " + Arrays.toString(reversedArray));
//	}
//	
//	public static void reverseIntegerArray() { 
//		Integer[] inputArray = {3,7,9,6,4}; 
//        // Converting Array to List 
//        List<Integer> list = Arrays.asList(inputArray); 
//        // Reversing the list using Collections.reverse() method 
//        Collections.reverse(list); 
//        // Printing the reverse Array 
//        System.out.print("Reverse Array :");
//        for(Integer val : list)
//            System.out.print(" "+val);
//   }
//	
//	public static double findMean()
//    {
//		
//		int a[] = { 1, 3, 4, 2, 7, 5, 8, 6 };
//        int n = a.length;
//        
//        int sum = 0;
//        for (int i = 0; i < n; i++)
//            sum += a[i];
// 
//       return (double)sum / (double)n;
//        
//    }
//	
//	public static double findMedian()
//    {
//		int a[] = { 1, 3, 4, 2, 7, 5, 8, 6 };
//        int n = a.length;
//        // First we sort the array
//        Arrays.sort(a);
// 
//        // check for even case
//        if (n % 2 != 0)
//            return (double)a[n / 2];
// 
//        return (double)(a[(n - 1) / 2] + a[n / 2]) / 2.0;
//    }
//	
//	public static void findduplicate()
//	{
//		String[]  arr1 = {"abc", "java", "javahungry", "java", "javahungry" };
//
//	    for(int i=0; i < arr1.length-1; i++){
//	        for(int j=i+1; j < arr1.length; j++) {
//	            
//	            if(arr1[i].equals(arr1[j]) && i!=j ) {
//	                System.out.println("Duplicate in Array is : "+ arr1[j]);
//
//	            }
//	        }
//	    }
//	}
//}
