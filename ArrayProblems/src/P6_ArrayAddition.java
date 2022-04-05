public class P6_ArrayAddition {

	public static void main(String[] args) {
		
		int firstArr[] = {9,1,8,9,2};
		int secondArr[] = {9,1,2,7};
		int resultArr[] = new int[firstArr.length > secondArr.length?firstArr.length:secondArr.length];
		int carry = 0;
		int sum = 0;
		
		int i = firstArr.length - 1;
		int j = secondArr.length - 1;
		int k = resultArr.length - 1;
		
		while(k >= 0) {
			if(i >= 0 && j >= 0) {
				sum = firstArr[i] + secondArr[i] + carry;
			}
			else if(i >= 0 && j < 0) {
				sum = firstArr[i] + carry;
			}
			
			else if(j >= 0 && i < 0) {
				sum = secondArr[j] + carry;
			}
			
			carry = sum / 10;
			sum = sum % 10;
			
			resultArr[k] = sum;
			i--;
			j--;
			k--;
		}
		
		if(carry != 0) {
			System.out.print(carry);
		}
		

	}

}
