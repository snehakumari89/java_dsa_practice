package numberBasedQuestion;
import java.util.*;
public class GCD_HCF {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m1=sc.nextInt();
        int m2=sc.nextInt();
        int min=0;
         if(m1>m2)
             min=m2;
         else
             min=m1;
         for(int i=min;i>=1;i--)//tc min(a,b)
         {
             if(m1%i==0 && m2%i==0)
             {
                 System.out.println(i);
                 break;
             }
         }

    }
}
