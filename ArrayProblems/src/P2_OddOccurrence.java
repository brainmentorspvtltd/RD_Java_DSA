
public class P2_OddOccurrence {

	public static void main(String[] args) {
		
		int arr[] = {2,3,4,5,4,3,2,3,5};
		int result = 0;
		int temp = 0;
		for(int i = 0; i < arr.length; i++) {
			temp = result ^ arr[i];
			System.out.println(result + " ^ " + arr[i] + " = " + temp);
			result = result ^ arr[i];
		}
		
		System.out.println("Final Result : " +result);

	}

}
