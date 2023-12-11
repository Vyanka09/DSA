package Array__problems;

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        System.out.println("Enter size of array:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int sum=(n+1)*(n+2)/2;
        int arraysum=0;
        for(int i=0;i<arr.length;i++)
        {
            arraysum+=arr[i];
        }
        System.out.println("Missing number= "+(sum-arraysum));
    }
}
