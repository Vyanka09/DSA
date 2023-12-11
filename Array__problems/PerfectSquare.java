package Array__problems;

import java.util.Scanner;

public class PerfectSquare {

    static boolean isPerfectSquare(int n)
    {
        int low=0;
        int high=n;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            long val=mid*mid;
            if(val==n)
            {
                return true;
            }
            else if(val<n)
            {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isPerfectSquare(n));
    }
}
