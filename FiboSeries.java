package codes;

import java.util.Scanner;

public class FiboSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Nth Term");
		int n = new Scanner(System.in).nextInt();
		int a = 0; // first number
		int b = 1; // second number
		
		for(int i = 1; i<=n; i++) {
			System.out.println(a);
			int c = a + b ;// third number
			a = b;// first number place second 
			b = c ; // second number place third
		}
	}

}
