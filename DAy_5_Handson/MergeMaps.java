package DAy_5_Handson;

import java.util.*;

public class MergeMaps {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Map1 Size: ");
        int n1 = sc.nextInt();

        HashMap<String,Integer> map1 = new HashMap<>();

        for(int i=0;i<n1;i++) {
            String key = sc.next();
            int value = sc.nextInt();
            map1.put(key,value);
        }

        System.out.print("Map2 Size: ");
        int n2 = sc.nextInt();

        HashMap<String,Integer> map2 = new HashMap<>();

        for(int i=0;i<n2;i++) {
            String key = sc.next();
            int value = sc.nextInt();
            map2.put(key,value);
        }

        for(String key : map2.keySet()) {

            map1.put(key,
                    map1.getOrDefault(key,0)
                    + map2.get(key));
        }

        System.out.println(map1);
    }
}
