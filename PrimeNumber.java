package codes;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// System.in - gives u InputStream through this we can read the input from keyboard
		// All the Input Store in Buffer (Scanner)
		System.out.println("Enter the Number");
		int n = scanner.nextInt();
		int factorCount = 0;
		//for(int i = 2; i<=Math.sqrt(n); i++) {
		for(int i = 2; i*i<=n; i++) {
			if(n%i==0) {
				factorCount ++ ; // factorCount = factorCount + 1;
				
			}
		}
		System.out.println(factorCount == 0 ?" Prime Number ":" Not Prime ");
		scanner.close();

	}

}
