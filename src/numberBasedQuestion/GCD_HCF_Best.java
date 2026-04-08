package numberBasedQuestion;
import java.util.*;

public class GCD_HCF_Best {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        while(a!=0 && b!=0)//tc is 0(logn)
        {
            if(a>b)
            {
                a=a%b;
            }
            else
                b=b%a;
        }
        if(a!=0)
            System.out.println(a);
        else
            System.out.println(b);

    }
}
