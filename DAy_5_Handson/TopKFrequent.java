package DAy_5_Handson;

import java.util.*;

public class TopKFrequent {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        HashMap<Integer,Integer> map =
                new HashMap<>();

        for(int i = 0; i < n; i++) {

            nums[i] = sc.nextInt();

            map.put(nums[i],
                    map.getOrDefault(nums[i],0)+1);
        }

        int k = sc.nextInt();

        PriorityQueue<Integer> pq =
                new PriorityQueue<>(
                        (a,b) ->
                                map.get(a)-map.get(b));

        for(int num : map.keySet()) {

            pq.offer(num);

            if(pq.size() > k)
                pq.poll();
        }

        ArrayList<Integer> result =
                new ArrayList<>();

        while(!pq.isEmpty()) {
            result.add(pq.poll());
        }

        System.out.println(result);
    }
}