import java.util.ArrayList;

class SubSequenceOfString{
    public static void main(String[] args) {
        String str = "abcd";
        ArrayList<String> subSeq = new ArrayList<>();
        for(int i = 0; i<str.length(); i++){
            char firstChar = str.charAt(i);
            if(subSeq.size()==0){
                subSeq.add(""); // Not Include it
                subSeq.add(String.valueOf(firstChar));  // Include It
                continue;
            }
            int len = subSeq.size();
            for(int j = 0; j<len; j++){
                // Not Include it
                String temp2 = ""+firstChar;
                if(!subSeq.contains(temp2)){
                    subSeq.add(temp2); // Include it
                    }
                String temp = subSeq.get(j)+firstChar;
                if(!subSeq.contains(temp)){
                subSeq.add(temp); // Include it
                }
            }

        }
        System.out.println("Sub Seq "+subSeq);
    }
}