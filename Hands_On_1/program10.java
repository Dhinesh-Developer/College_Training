package Hands_On_1;

public class program10 {

    public static void main(String[] args) {

        int n = 7;
        int mid = n / 2;

		for (int i =0;i <n;i++){
            for (int j = 0;j < n;j++){
                if (Math.abs(i - mid)+ Math.abs(j-mid)<= mid){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }
}