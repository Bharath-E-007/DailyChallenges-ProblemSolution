import java.util.*;

public class sequence    {

public static void main(String[] args) {

int val=new Scanner(System.in).nextInt();

long f=0,s=1;

System.out.print(f+" ");

if(val>=1)

System.out.print(s+" ");

for(int i=2;i<val;i++){

long temp=s;

s=reverse(f)+reverse(s);

System.out.print(s+" ");

f=temp;

} System.exit(0);

}
public static long reverse(long val){

return Long.parseLong((new StringBuilder(String.valueOf(val )).reverse().toString()));
}
}
/*
 * starts with 0 1 and form 0+1=1 and so on reverse and add previous two digits in sequence
 * 20
   0 1 1 2 3 5 8 13 39 124 514 836 1053 4139 12815 61135 104937 792517 1454698 9679838 
 */