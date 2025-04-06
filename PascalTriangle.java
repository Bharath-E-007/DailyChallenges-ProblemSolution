import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(); // Fixed variable assignment syntax
        scanner.close();

        int start = 0;
        int[] arr = {1, 1}; // Fixed array initialization
        int end = 1;

        for (int i = num - 1; i >= 0; i--) {
            System.out.print("- ".repeat(i));
            if (start >= 1)
                System.out.print("1 ");

            int[] newArr = new int[1000];
            newArr[0] = 1;

            int ind = 1;

            if (start >= 2) {
                for (int j = 0; j < end; j++) { // Fixed loop syntax
                    System.out.print(arr[j] + arr[j + 1] + " ");
                    newArr[ind++] = arr[j] + arr[j + 1]; // Fixed array assignment
                }
                end++;
            }

            newArr[ind] = 1; // Add the last element as 1
            arr = Arrays.copyOf(newArr, ind + 1); // Clone only the relevant portion of the array
            start++;

            if (start > 1)
                System.out.print("1");

            System.out.println();
        }
    }
}
