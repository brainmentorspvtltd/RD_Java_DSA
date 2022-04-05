import java.util.Stack;

public class ReverseString {
	
	static String reverse(String str) {
		char arr[] = str.toCharArray();
		int i = 0;
		int j = arr.length - 1;
		char temp = '\0';
		while(i < j) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		return String.valueOf(arr);
	}
	
	static void approach_2() {
		String str = "This is brain mentors";
		Stack<String> stack = new Stack<>();
		String words[] = str.split(" ");
		for(String word : words) {
			stack.push(word);
		}
		
		while(!stack.isEmpty()) {
			System.out.print(stack.pop() + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This is some data";
		String rev_string = reverse(str);
//		System.out.println(rev_string);
		String wordArr[] = rev_string.split(" ");
		String sentence = "";
		for(String word : wordArr) {
			sentence += reverse(word) + " ";
		}
		System.out.println(sentence);
		
		approach_2();
	}

}
