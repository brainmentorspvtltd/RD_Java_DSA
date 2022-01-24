package codes;

public class BreakContinue {

	public static void main(String[] args) {
		// break - keyword - exit from the current loop
		// loop contains cycles  (also known as iterations)
		// for example below loop has 10 iterations
		for(int  i= 1 ;i<=10; i++) {
			if(i==5) {
				continue; // skip the current iteration (5 will be skip)
				//break; //exit from the current loop (ith loop)
			}
			System.out.println(i);
		}
		

	}

}
