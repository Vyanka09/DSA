package Array__problems;

import java.util.Scanner;

public class Checkifarrayissorted {

    static boolean issorted(int arr[])
    {
        boolean res=true;

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<=arr[i-1])
            {
                res=false;
                return res;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:- ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements:- ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        if(issorted(arr))
        {
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }
    }
}
