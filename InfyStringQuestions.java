import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class InfyStringQuestions {

    public static <K,V extends Comparable<V> > Map<K,V> sort(Map<K,V> map) {
        Comparator<K> valueCompare = new Comparator<K>() {
            public int compare(K K1, K K2) {
                int comp = map.get(K1).compareTo(map.get(K2));
                if(comp == 0) {
                    return 1;
                }
                else {
                    return comp;
                }
            }
        };

        Map<K,V> sorted = new TreeMap<>(valueCompare);
        sorted.putAll(map);
        return sorted;
    }
    public static void main(String[] args) {
        // String s1 = "ac23gh12trpo29rtq2";
        String s1 = "ab20bc20bnm20yun20enj20";
        String s1Arr[] = s1.split("(?<=\\d)(?=\\D)");
        TreeMap<String, Integer> map = new TreeMap<String, Integer>();
        // arr[0].split("(?<=\\D)(?=\\d)");
        for(int i = 0; i < s1Arr.length; i++) {
            String s2Arr[] = s1Arr[i].split("(?<=\\D)(?=\\d)");
            map.put(s2Arr[0], Integer.valueOf(s2Arr[1]));
        }

        System.out.println(map);
        Map sortedMap = sort(map);
        System.out.println(sortedMap);

        // Set set = sortedMap.entrySet();
        // System.out.println(set);
        Iterator i = sortedMap.entrySet().iterator();
        String result = "";
        while(i.hasNext()) {
            Map.Entry mp = (Map.Entry)i.next();
            result += mp.getKey();
        }

        System.out.println(result);

    }
}
