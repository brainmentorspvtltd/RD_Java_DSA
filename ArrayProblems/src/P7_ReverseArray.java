public class P7_ReverseArray {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
		int i = 0;
		int j = arr.length - 1;
		int temp;
		while(i < j) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		
		for(int k : arr) {
			System.out.print(k + ",");
		}
		

	}

}
