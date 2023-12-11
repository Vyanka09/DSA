package Binary_search;

import java.util.Scanner;



public class Square_root {


    static int squareroot(int n)
    {
        int start=1;
        int end=n;
        int sol=-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            int ans=mid*mid;
            if(ans==n)
            {
               sol=mid;
               return sol;

            }
            else if(ans<n)
            {
                sol=mid;
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return sol;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n- ");
        int n=sc.nextInt();
        int k=squareroot(n);
        System.out.println("Square root= "+k);
    }
}
