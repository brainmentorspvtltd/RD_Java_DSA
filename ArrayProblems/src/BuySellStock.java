public class BuySellStock {
	
	static void approach_1(int arr[]) {
		int first = 0;
		int last = 0;
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(max < arr[j] - arr[i]) {
					max = arr[j] - arr[i];
					first = arr[i];
					last = arr[j];
				}
			}
		}
		System.out.println(first + "," + last);
		System.out.println("Profit is : " + max);
	}
	
	static void approach_2(int arr[]) {
		int profit = 0;
		int finalProfit = 0;
		int prefixmin[] = new int[arr.length];
		prefixmin[0] = arr[0];
		for(int i = 1; i < arr.length; i++) {
			prefixmin[i] = Math.min(prefixmin[i-1], arr[i]);
		}
		
		for(int i = 1; i < arr.length; i++) {
			finalProfit = arr[i] - prefixmin[i];
			profit = Math.max(finalProfit, profit);
		}
		System.out.println("Profit is : "+profit);
	}
	
	static void approach_3(int arr[]) {
		int profit = 0;
		int finalProfit = 0;
		int min = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			finalProfit = arr[i] - min;
			profit = Math.max(finalProfit, profit);
			min = Math.min(min, arr[i]);
		}
		System.out.println("Profit is : "+profit);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,9,6,8,7,3,18,1,7};
		approach_1(arr);
		approach_2(arr);
		approach_3(arr);
	}

}
