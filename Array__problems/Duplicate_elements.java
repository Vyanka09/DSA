package Array__problems;

import java.util.Scanner;
//Example array is [2,3,4,3,2,6,7,8,9] then duplicate will be 2,3,4.
public class Duplicate_elements {
    public static void duplicate(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                    System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter size of array:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        duplicate(arr);
    }
}
