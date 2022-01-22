package codes;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		System.out.println("Enter the Number");
		int n = new Scanner(System.in).nextInt();
		int n2 = n; // n copy n2
		int countDigit = 0;
		while(n2!=0) {
			n2 = n2 /10; // make my number small
			countDigit++;
		}
		int pow = (int)Math.pow(10, countDigit-1);
		//System.out.println(pow);
		while(n!=0) {
			System.out.println(n/pow);
			n = n % pow; // making my number small
			pow = pow/10; // making my power small
		}

	}

}
