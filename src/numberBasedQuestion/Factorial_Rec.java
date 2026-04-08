package numberBasedQuestion;
import java.util.*;
public class Factorial_Rec {
    public static int fact(int num)
    {
        if(num==1)
            return 1;
        return num*fact(num-1);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=fact(n);
        System.out.println(ans);

    }

}
