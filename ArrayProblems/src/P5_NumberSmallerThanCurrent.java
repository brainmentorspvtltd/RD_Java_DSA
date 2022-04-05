public class P5_NumberSmallerThanCurrent {

	public static void main(String[] args) {
		
		int arr[] = {3,4,2,4,5,7,8,3};
		int n = arr.length; 
		int output[] = new int[n];
		int hash[] = new int[100];
		for(int i = 0; i < arr.length; i++) {
			if(hash[arr[i]] == 0) {
				hash[arr[i]] = 1;
			}
			else {
				hash[arr[i]] += 1;	
			}
		}
		
//		for(int i = 0; i < 10; i++) {
//			System.out.print(hash[i] + ",");
//		}
		
		for(int i = 1; i < hash.length; i++) {
			int curr = hash[i];
			int prev = hash[i-1];
			hash[i] = curr + prev;
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.print(hash[i] + ",");
		}
		
		for(int i = 0; i < n; i++) {
			output[i] = hash[(arr[i] - 1)];
		}
		for(int i : output) {
			System.out.print(i + ",");
		}

	}

}
