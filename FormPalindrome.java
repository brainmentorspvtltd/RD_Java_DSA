import java.util.HashMap;
import java.util.Map;

public class FormPalindrome {
    public static void main(String[] args) {
        String str = "carrace";
        int oddCount = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i= 0 ; i<str.length(); i++){
            char singleChar = str.charAt(i);
            if(map.get(singleChar)==null){
                map.put(singleChar, 1);
            }
            else{
                int count = map.get(singleChar);
                count++;
                map.put(singleChar, count);


            }
        }
        for(Map.Entry<Character,Integer> m : map.entrySet()){
            if(m.getValue()%2!=0){
                oddCount++;
                if(oddCount>1){
                    System.out.println("Not Form a Palindrome");
                    return ;
                }
            }
        }
        System.out.println("Form a Palindrome");
    }
}
