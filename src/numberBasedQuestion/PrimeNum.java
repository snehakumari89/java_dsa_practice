package numberBasedQuestion;
import java.util.*;
public class PrimeNum {
    public static boolean prime(int num)
    {
        for(int i=2;i<num/2;i++)//it is 0(n) so in place of n/2 we use squareroot of n i.e{Math.sqrt(n)}
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean ans=prime(n);
        System.out.println(ans);
    }
}
