package DAy_5_Handson;

import java.util.*;

public class RemoveOccurrences {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size: ");
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter Elements:");

        for(int i=0;i<n;i++) {
            list.add(sc.nextInt());
        }

        System.out.print("Enter Element to Remove: ");
        int target = sc.nextInt();

        Iterator<Integer> it = list.iterator();

        while(it.hasNext()) {
            if(it.next() == target) {
                it.remove();
            }
        }

        System.out.println(list);
    }
}
