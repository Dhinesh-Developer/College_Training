package DAy_5_Handson;

import java.util.*;

public class SortMapByValues {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Entries: ");
        int n = sc.nextInt();

        HashMap<String,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++) {

            String key = sc.next();
            int value = sc.nextInt();

            map.put(key,value);
        }

        List<Map.Entry<String,Integer>> list =
                new ArrayList<>(map.entrySet());

        list.sort((a,b) -> b.getValue()-a.getValue());

        LinkedHashMap<String,Integer> result =
                new LinkedHashMap<>();

        for(Map.Entry<String,Integer> entry : list) {
            result.put(entry.getKey(),entry.getValue());
        }

        System.out.println(result);
    }
}
