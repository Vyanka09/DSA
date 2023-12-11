package Array__problems;

import java.util.Scanner;

public class PrintEvenElements {
    static void printEvenElements(int arr[])
    {
        for(int k:arr)
        {
            if(k%2==0)
            {
                System.out.print(k+" ");
            }
        }
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
        printEvenElements(arr);
    }
}
