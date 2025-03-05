
import java.util.Scanner;

public class greaternum{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int arr[]=new int[num];

        for(int i=0;i<num;i++)
          arr[i]=sc.nextInt();
        int k=sc.nextInt();
        int max=0;
        for(int i=0;i<num;i++){
            max=Math.max(max,arr[i]);
            if((i+1)%k==0){
                System.out.println(max);
                if(i+1<num)
                   max=arr[i+1];
            }
        }
        sc.close();
        System.exit(0);
    }
}
/*
 * Example Input/Output 11

Input:

10 2 55 88 14 678 455 9899 12 545 228 4

Output
88 9899
Explanation:

Here N 10 and K = 4.

The maximum Integer among the first 4 Integers is 88 (2, 55, 88, 14), 50 88 ls printed, The maximum integer among the next 4 integers is 9899 (678, 455, 9899, 12), 50 9899 is printed.

The last set contains only two integers, so the last set is ignored.

Example Input/Output 21

Input:

10 2 55 88 14 678 455 9899 12 545 222 5

Output: 678 9899
 */