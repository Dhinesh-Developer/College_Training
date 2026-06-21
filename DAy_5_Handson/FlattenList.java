package DAy_5_Handson;

import java.util.*;

public class FlattenList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Number of Lists: ");
        int n = sc.nextInt();

        ArrayList<Integer> result =
                new ArrayList<>();

        for(int i=0;i<n;i++) {

            System.out.print("Size of List " + (i+1)+": ");
            int size = sc.nextInt();

            for(int j=0;j<size;j++) {
                result.add(sc.nextInt());
            }
        }

        System.out.println(result);
    }
}
