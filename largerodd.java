import java.util.*;

public class largerodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = str.length() - 1; i >= 0; i--) {
            if (Character.getNumericValue(str.charAt(i)) % 2 == 1) {
                System.out.println(str.substring(0, i + 1));
                System.exit(0);
            }
        }
        System.out.println(0);
    }
}
