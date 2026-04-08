package array;
import java.util.*;
public class SubarraySumOn2 {
    public static void main(String[] args) {
        int arr[]={5,3,4,2,1};
        int n=arr.length;
        int totalSum=0;
        for(int i=0;i<n;i++)
        {
            int sum=0;
         for(int j=i;j<n;j++)
         {
             sum=sum+arr[j];
             totalSum=totalSum+sum;
         }
        }
        System.out.println(totalSum);
    }
}
