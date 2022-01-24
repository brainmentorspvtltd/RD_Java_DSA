package codes;

import java.util.Scanner;

public class RotateNumber {
// n is a postive n>1 and n<10000
	// k is negative
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = scanner.nextInt();
		System.out.println("Enter the No of Rotations");
		int k = scanner.nextInt();
		
		// 1st Step - Count Digit
		int countDigit = 0;
		int n2 = n; // Copy of n because n will destroy after the loop
		while(n!=0) {
			countDigit++;
			n = n/10;
		}
		// If k is Negative
		if(k<0) {
			k = k + countDigit;
		}
		// Assume if it is large than countOf Digit
		k = k % countDigit; // Now it settle down in number of digit range
		int leftPart = n2 / (int)Math.pow(10,k);
		int rightPart = n2 % (int) Math.pow(10, k);
		int power = countDigit - k;
		int result = rightPart * (int)Math.pow(10, power) + leftPart;
		System.out.println(result);
		
		scanner.close();

	}

}
