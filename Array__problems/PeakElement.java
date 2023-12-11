package Array__problems;

import java.util.Scanner;

public class PeakElement {

    static int peakelement(int arr[])
    {
        int result=-999999999;

        for(int i=1;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
            {
                result=arr[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Enter size of array:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elemets:- ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Peak element is :- "+peakelement(arr));
    }
}
