public class P4_BoyerMoore {

	public static void main(String[] args) {
		
		int arr[] = {2,3,4,2,3,2,2,5,6,2,2,2};
		int count = 0;
		int majorityCount = arr.length / 2;
		int majorityElement = 0;
//		This logic helps you to find out majority element
		for(int i = 0; i < arr.length; i++) {
			if(count == 0) {
				majorityElement = arr[i];
			}
			if(majorityElement == arr[i]) {
				count++;
			}
			else {
				count--;
			}
		}
		
//		Now find out the count of majority Element
		count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == majorityElement) {
				count++;
			}
		}
		
		if(count > majorityCount) {
			System.out.println(majorityElement + " is majority element");
		}
		else {
			System.out.println("No majority element is present...");
		}

	}

}
