import java.util.*;
public class TimeFormat {
    public static void main(String[] args) {
        // Initialize scanner to read input
        Scanner sc = new Scanner(System.in);

        // Read the time in HH:MM:SS format
        String[] str = sc.nextLine().split(":");

        // Read the values for X, Y, Z (hours, minutes, seconds to be added)
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();

        // Parse the time input into hours, minutes, and seconds
        int h = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        int s = Integer.parseInt(str[2]);

        // First, add X hours
        h = (h + X) % 24;
        System.out.printf("%02d:%02d:%02d\n", h, m, s);

        // Second, add Y minutes
        m = m + Y;
        h = h + m / 60;  // Add hours from minutes
        m = m % 60;  // Keep minutes within 0-59
        h = h % 24;  // Keep hours within 0-23
        System.out.printf("%02d:%02d:%02d\n", h, m, s);

        // Third, add Z seconds
        s = s + Z;
        m = m + s / 60;  // Add minutes from seconds
        s = s % 60;  // Keep seconds within 0-59
        h = h + m / 60;  // Add hours from minutes
        m = m % 60;  // Keep minutes within 0-59
        h = h % 24;  // Keep hours within 0-23
        System.out.printf("%02d:%02d:%02d\n", h, m, s);

        // Close the scanner
        sc.close();
    }
}
/*Example Input/Output 1:

Input:

10:05:45

4 65 100

Output:

14:05:45

15:10:45

15:12:25

Explanation:

Here T 10:05:45, X4, Y= 65 and Z = 100.

After adding 4 hours, the time becomes 14:05:45.

After adding 65 minutes, the time becomes 15:10:45.

After adding 100 seconds, the time becomes 15:12:25.

Example Input/Output 2:

Input:

23:50:00

3 15 45

Output:

03:05:00

02:50:00 03:05:45

*/