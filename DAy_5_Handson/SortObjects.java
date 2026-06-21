package DAy_5_Handson;

import java.util.*;

class Person {

    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class SortObjects {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Persons: ");
        int n = sc.nextInt();

        ArrayList<Person> list = new ArrayList<>();

        for(int i = 0; i < n; i++) {

            String name = sc.next();
            int age = sc.nextInt();

            list.add(new Person(name, age));
        }

        Collections.sort(list,
                (a, b) -> a.age - b.age);

        for(Person p : list) {
            System.out.println(
                    p.name + "(" + p.age + ")");
        }
    }
}
