package array;
import java.util.*;
public class SubarraySum0n1 {
    public static void main(String[] args) {
        int arr[]={5,3,4,2,1};
        int totalSum=0;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            totalSum+=arr[i]*(i+1)*(n-i);
        }
        System.out.println(totalSum);

    }
}
