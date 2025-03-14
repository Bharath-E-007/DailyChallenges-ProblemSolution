import java.util.*;

public class VirusSpread {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int arr[] = new int[num];

        for (int i = 0; i < num; i++)
            arr[i] = sc.nextInt();

        int count = 0, remainingHealthy = 0;
        
        while (true) {
            boolean changed = false;
            int newArr[] = arr.clone(); 
            
            for (int i = 0; i < num; i++) {
                if (arr[i] == 1) {
                    if ((i > 0 && arr[i - 1] == 2) || (i < num - 1 && arr[i + 1] == 2)) {
                        newArr[i] = 2;
                        changed = true;
                    }
                }
            }

            if (!changed)
                break;

            arr = newArr;
            count++;
        }

        for (int val : arr) {
            if (val == 1)
                remainingHealthy++;
        }

        System.out.println(count + " " + remainingHealthy);
        sc.close();
    }
}
/*
 * There are N chairs in a line. The program must accept N integer values denoting the seating details in these N chairs.

- 1 represents a healthy person sitting in a chair.

- 0 represents the chair being empty.

- 2 represents the chair being occupied by a Corona virus infected person.

Each Corona virus infected person will affect the healthy persons sitting adjacent to him/her so that the next day those affected will inturn start infecting their healthy adjacent persons. The program must print the number of days D required for the virus to stop spreading and the number of persons H who remain not infected by the virus in the end.

Boundary Condition(s):

2 <= N <= 20

Input Format:

The first line contains N.

The second line contains the N integer values separated by a space.

Output Format:

The first line contains D and H separated by a space.

Example Input/Output 1:

Input:

7

1 1 2 1 0 1 0

Output: 3 1

Explanation:

At the end of the 1st day, the status will be 122 2010.

At the end of the 2nd day, the status will be 222 2010.

On the 3rd day, no infection happens.

So it takes 3 days for the virus to stop spreading and 1 person remains healthy in the end.
 */