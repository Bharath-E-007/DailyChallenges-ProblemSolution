public class PrefixConvertCheckDivisibleByK {
   
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

int num = sc.nextInt();
int k = sc.nextInt();
String str = Integer.toBinaryString(num);

int count = 0;

for (int i = str.length(); i > 0; i--) {

	if (Integer.parseInt(str.substring(0, i), 2) % k == 0) {
		count++;
	}

}
System.out.println(count);
System.exit(0);
}
}
