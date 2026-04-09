package numberBasedQuestion;
import java.util.*;
public class Strong_Number {
    static int fact(int num)
    {
        if(num==0 || num==1)
            return 1;
        else
            return num*fact(num-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        int temp=num;
        while(num>0)
        {
           int rem=num%10;
           sum=sum+fact(rem);
           num=num/10;
        }
        System.out.println(sum);
        if(temp==sum)
            System.out.println("Strong number");
        else
            System.out.println("not strong number");
    }
}
