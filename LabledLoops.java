package codes;

public class LabledLoops {

	public static void main(String[] args) {
		outerloop: // this is a label 
		for(int i = 1; i<=3; i++) {
			
			for(int j = 1; j<=3; j++) {
				if(i==j) {
					continue outerloop; // skip the current outerloop label of (ith Loop)
					//break outerloop; //exit from the outer loop label (ith Loop)
					//break; // exit from the current loop (jth Loop)
					//continue ; // skip the current iteration of (jth Loop)
				}
				System.out.println("I is "+i+" and J is "+j);
			}
		}

	}

}
