import java.util.*;
public class flowerPlant {
   
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read the number of plants
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Read the plant types
        String[] ch = scanner.nextLine().split(" ");

        // Read the maximum number of flowers each plant can produce
        int[] lis = new int[n];
        for (int i = 0; i < n; i++) {
            lis[i] = scanner.nextInt();
        }

        // Read the number of days
        int t = scanner.nextInt();

        // Initialize counters for each flower color
        int r = 0, g = 0, b = 0;

        // Iterate over each day
        for (int i = 1; i <= t; i++) {
            for (int j = 0; j < n; j++) {
                if (ch[j].equals("R") && lis[j] > 0) {
                    lis[j]--;
                    r++;
                }
                if (i % 2 == 0 && ch[j].equals("G") && lis[j] > 0) {
                    lis[j]--;
                    g++;
                }
                if (i % 3 == 0 && ch[j].equals("B") && lis[j] > 0) {
                    lis[j]--;
                    b++;
                }
            }
        }

        // Print the results
        System.out.println(r + " " + g + " " + b);
    }
}

