package DAy_5_Handson;

import java.util.*;

public class FirstNonRepeating {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        HashMap<Integer,Integer> map =
                new HashMap<>();

        for(int i=0;i<n;i++) {

            arr[i] = sc.nextInt();

            map.put(arr[i],
                    map.getOrDefault(arr[i],0)+1);
        }

        for(int num : arr) {

            if(map.get(num)==1) {
                System.out.println(num);
                return;
            }
        }

        System.out.println("No Non-Repeating Element");
    }
}
