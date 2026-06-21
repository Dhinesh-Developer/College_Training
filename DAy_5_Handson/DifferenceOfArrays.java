package DAy_5_Handson;

import java.util.*;

public class DifferenceOfArrays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();

        int[] nums1 = new int[n1];

        for(int i=0;i<n1;i++) {
            nums1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();

        int[] nums2 = new int[n2];

        for(int i=0;i<n2;i++) {
            nums2[i] = sc.nextInt();
        }

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for(int x : nums1)
            set1.add(x);

        for(int x : nums2)
            set2.add(x);

        ArrayList<Integer> ans1 =
                new ArrayList<>();

        ArrayList<Integer> ans2 =
                new ArrayList<>();

        for(int x : set1) {
            if(!set2.contains(x))
                ans1.add(x);
        }

        for(int x : set2) {
            if(!set1.contains(x))
                ans2.add(x);
        }

        System.out.println(ans1);
        System.out.println(ans2);
    }
}
