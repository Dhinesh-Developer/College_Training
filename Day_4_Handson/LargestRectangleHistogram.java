package Day_4_Handson;

import java.util.Scanner;
import java.util.Stack;

public class LargestRectangleHistogram {

    public static int largestRectangle(int[] heights) {

        Stack<Integer> stack = new Stack<>();

        int maxArea = 0;
        int n = heights.length;

        for (int i = 0; i <= n; i++) {

            int currentHeight = (i == n) ? 0 : heights[i];

            while (!stack.isEmpty() &&
                    currentHeight < heights[stack.peek()]) {

                int height = heights[stack.pop()];

                int width;

                if (stack.isEmpty())
                    width = i;
                else
                    width = i - stack.peek() - 1;

                maxArea = Math.max(maxArea, height * width);
            }

            stack.push(i);
        }

        return maxArea;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size: ");
        int n = sc.nextInt();

        int[] heights = new int[n];

        System.out.println("Enter Heights:");

        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }

        System.out.println("Largest Area = " +
                largestRectangle(heights));
    }
}