
public class P1_Sort01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,1,0,0,1,0,0,1,1,0,0,1};
		int n = arr.length;
		int count = 0;
		for(int i=0; i < arr.length; i++) {
			if(arr[i] == 0) {
				count++;
			}
		}
		
		for(int i = 0; i < count; i++) {
			arr[i] = 0;
		}
		
		for(int i = count; i < n; i++) {
			arr[i] = 1;
		}
		
		for(int i : arr) {
			System.out.print(i + ",");
		}

	}

}
