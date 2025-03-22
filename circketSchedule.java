import java.util.Scanner;

public class circketSchedule {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int size = sc.nextInt();
    sc.nextLine();

    String str[] = new String[size];

    for (int i = 0; i < size; i++) {
      str[i] = sc.nextLine();
    }

    for (int i = 0; i < size; i++) {
      String s1[] = str[i].split(" - ");

      for (int j = i + 1; j < size; j++) {
        String s2[] = str[j].split(" - ");

        System.out.println(s1[0] + " vs " + s2[0] + " (" + s1[1] + ")");
        System.out.println(s2[0] + " vs " + s1[0] + " (" + s2[1] + ")");
      }
    }
    sc.close();
    System.exit(0);
  }
}

/*
 * Cricket Tournament Schedule

There are N teams playing in a cricket tournament. The team name and home ground name of each team are passed as the input. Each team plays two matches against other teams (one in the home ground and the other in the opponent's home ground). The program must create the schedule for the matches in the tournament. The details of each match must be printed in the format as given below.

Host Team Name vs Visiting Team Name (Host's Home Ground Name)

Example Input/Output 1:

Input:

4

Chennai Super Kings - M. A. Chidambaram Stadium

Kolkata Knight Riders - Eden Gardens

Mumbai Indians - Wankhede Stadium

Royal Challengers Bangalore - M. Chinnaswamy Stadium

Output

Chennai Super Kings vs Kolkata Knight Riders (M. A. Chidambaram Stadium)

Kolkata Knight Riders vs Chennai Super Kings (Eden Gardens)

Chennai Super Kings vs Mumbai Indians (M. A. Chidambaram Stadium)

Mumbai Indians vs Chennai Super Kings (Wankhede Stadium)

Chennai Super Kings vs Royal Challengers Bangalore (M. A. Chidambaram Stadium)

Royal Challengers Bangalore vs Chennai Super Kings (M. Chinnaswamy Stadium)

Kolkata Knight Riders vs Mumbai Indians (Eden Gardens)

Mumbai Indians vs Kolkata Knight Riders (Wankhede Stadium)

Kolkata Knight Riders vs Royal Challengers Bangalore (Eden Gardens)

Royal Challengers Bangalore vs Kolkata Knight Riders (M. Chinnaswamy Stadium)

Mumbai Indians vs Royal Challengers Bangalore (Wankhede Stadium)

Royal Challengers Bangalore vs Mumbai Indians (M. Chinnaswamy Stadium)
*/
