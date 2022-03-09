package section_2;

public class NumberSystem {

	public static void main(String[] args) {
		
		int n = 390;
		int base = 8;
		int rev = 0;
		int temp = 1;
		
		while(n > 0) {
			int remainder = n % base;
			n = n / base;
			rev = rev + remainder * temp;
			temp = temp * 10;
		}
		System.out.println(rev);

	}

}
