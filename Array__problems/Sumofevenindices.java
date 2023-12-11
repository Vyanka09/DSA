package Array__problems;

import java.util.Scanner;

public class Sumofevenindices {

    static int evensum(int arr[])
    {
        int sum=0;
        for(int i=0;i<arr.length;i=i+2)
        {
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:- ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements:- ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Sum of even indices:- "+evensum(arr));
    }
}
