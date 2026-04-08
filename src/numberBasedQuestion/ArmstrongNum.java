package numberBasedQuestion;
import java.util.*;
public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num;
        int arm=0;
        while(num>0)
        {
            int rem=num%10;
            arm=arm+rem*rem*rem;
            num=num/10;
        }
       if(temp==arm)
       {
           System.out.println("Armstrong");
       }
       else
           System.out.println("Not ArmStrong");

    }
}
