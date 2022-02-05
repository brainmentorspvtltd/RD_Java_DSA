import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class InfyStrings {

    static String leftRotate(String str, int n) {
        n = n % str.length();
        String output = str.substring(n) + str.substring(0, n);
        return output;
    }

    static String rightRotate(String str, int n) {
        n = n % str.length();
        return leftRotate(str, str.length() - n);
    }
    public static void main(String[] args) {
        // String str = "hello223hey98";
        
        // 1st way
        // String num = "";
        // for(int i = 0; i < str.length(); i++) {
        //     int ascii = str.charAt(i);
        //     if(ascii >= 48 && ascii <= 57) {
        //         num += (char)ascii;
        //     }
        // }
        // int numbers = Integer.parseInt(num);
        // System.out.println(numbers);

        // 2nd way
        // str = str.replaceAll("[^\\d]", " ");
        // str = str.replaceAll(" ", "");
        // System.out.println(str);

        String str = "hello1hey35";
        String str2 = "2hef46fj78";
        
        str = str.replaceAll("[^\\d]", " ");
        str = str.replaceAll(" ", "");

        str2 = str2.replaceAll("[^\\d]", " ");
        str2 = str2.replaceAll(" ", "");

        // char arr_1[] = str.toCharArray();
        // char arr_2[] = str.toCharArray();

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length() || i < str2.length(); i++) {
            if(i < str.length()) {
                sb.append(str.charAt(i));
            }

            if(i < str2.length()) {
                sb.append(str2.charAt(i));
            }
        }

        System.out.println(sb.toString());

        // Palindrome
        int num = 123;
        String numStr = String.valueOf(num);
        StringBuilder sb1 = new StringBuilder();
        sb1.append(numStr);
        sb1.reverse();
        System.out.println(sb1);

        // Rotate String
        String str3 = "titusn:014 lotus:15";
        String strArr[] = str3.split(" ");
        // ["titusn:014", "lotus:15"]
        for(int i = 0; i < strArr.length; i++) {
            // System.out.println(strArr[i]);
            String strArr2[] = strArr[i].split(":");
            // ["titusn","014"]
            if(Integer.parseInt(strArr2[1]) % 2 == 0) {
                String op = rightRotate(strArr2[0], Integer.parseInt(strArr2[1]));
                System.out.println(op);
            }
            else {
                String op = leftRotate(strArr2[0], Integer.parseInt(strArr2[1]));
                System.out.println(op);
            }
            
        }

        String s4 = "little kettle";
        String s4arr[] = s4.split(" ");
        for(int i = 0; i < s4arr.length; i++) {
            int len = s4arr[i].length();
            Map<Character, Integer> count =  new HashMap<>();
            StringBuilder sb4 = new StringBuilder();
            for(int j = 0; j < len; j++) {
                char ch = s4arr[i].charAt(j);
                count.put(ch, count.getOrDefault(ch, 0) + 1);
                // {l = 2, i = 1, t = 2, e = 1}
            }
            // System.out.println(count);
            // count.entrySet().stream().sorted(Map.Entry.<Character, Integer>comparingByValue().reversed()).forEach(record -> {
            //     Character key = record.getKey();
            //     int value = record.getValue();
            //     for(int k = 0; k < value; k++) {
            //         sb4.append(key);
            //     }
            // });
            // System.out.println(sb.toString());
        }


        String s5 = "bs1jkb2njkhskjd2jbjbs6kjsnbkjs9sjkbsjh";
        s5 = s5.replaceAll("[^\\d]", " ");
        s5 = s5.replaceAll(" ", "");

        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for(int i = 0; i < s5.length(); i++) {
            set.add(s5.charAt(i));
        }

        String s6 = "";
        for(Character ch : set) {
            s6 += ch;
        }
        System.out.println(s6);

        String s7 = "090hyg890vhg456jnbju2gv6hhi8kjkgf5bj568ghbvhijhk987";

        String s8 = s7.replaceAll("[^\\d]", " ");
        // s8 = s8.replaceAll(" ", "");
        String tempArr[] = s8.split(" ");
        
        // for(int i = 0; i < numArr.length; i++) {
        //     System.out.println(numArr[i]);
        // }

        String s9 = s7.replaceAll("[\\d]", " ");
        s9 = s9.replaceAll(" ", "");

        // char tempArr[] = s8.toCharArray();

        // // System.out.println("Char Array : " + tempArr);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < tempArr.length; i++) {
            try {
                // System.out.println(Integer.valueOf(String.valueOf(tempArr[i])));
                // System.out.println("I is : " + tempArr[i]);
                // if(tempArr[i] == " " || tempArr[i] == "") {
                //     continue;
                // }
                int x = Integer.valueOf(String.valueOf(tempArr[i]));
                if(min > x) {
                    min = x;
                }

                if(max < x) {
                    max = x;
                }
                
            } catch (Exception e) {
                //TODO: handle exception
            }
            
        }

        System.out.println("Min : " + min);
        System.out.println("Max : " + max);

        int res = max - min;
        System.out.println(leftRotate(s9,res));

    }
}