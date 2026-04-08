package numberBasedQuestion;
import java.util.*;

public class GCD_HCF_Good {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        while(a!=b) {//max(a,b)
            if (a > b) {
               a=a-b;
            } else {
              b=b-a;
            }

        }
        System.out.println(a);
    }
}
