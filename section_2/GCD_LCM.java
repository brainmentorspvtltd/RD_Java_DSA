package section_2;

import java.util.Scanner;

public class GCD_LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first number : ");
		int x = scanner.nextInt();
		System.out.print("Enter second number : ");
		int y = scanner.nextInt();
		
		int copy_x = x;
		int copy_y = y;
		
		while(x % y != 0) {
			int remainder = x % y;
			x = y;
			y = remainder;
		}
		
		int gcd = y;
		System.out.println("GCD : "+gcd);
		int lcm = (copy_x * copy_y) / gcd;
		System.out.println("LCM : " +lcm);
		

	}

}
