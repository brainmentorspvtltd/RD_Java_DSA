package codes;

import java.util.Scanner;

public class WhileDemo {

	public static void main(String[] args) {
		System.out.println("Enter the Number");
		int n = new Scanner(System.in).nextInt();
		int countDigit = 0;
		while(n!=0) {
			n = n /10; // make my number small
			countDigit++;
		}
		System.out.println(countDigit);

	}

}
