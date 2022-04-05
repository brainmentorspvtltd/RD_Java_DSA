public class P3_MajorityElement {

	public static void main(String[] args) {
		
		int arr[] = {2,3,4,2,3,2,2,5,6,2,2,2};
		int count;
		int majorityCount = arr.length / 2;
		for(int i : arr) {
			count = 0;
			for(int j : arr) {
				if(i == j) {
					count++;
				}
			}
//			System.out.println("Count of " + i + " is " + count);
			if(count > majorityCount) {
				System.out.println(i + " is the majority element...");
				break;
			}
		}

	}

}
