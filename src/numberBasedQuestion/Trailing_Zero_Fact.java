package numberBasedQuestion;
import java.util.*;
public class Trailing_Zero_Fact {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int powOf5=5;
        while(n>=powOf5) {
            sum = sum + (n / powOf5);
            powOf5 = powOf5 * 5;
        }
        System.out.println(sum);
    }
}
