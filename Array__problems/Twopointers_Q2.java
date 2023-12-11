package Array__problems;

import java.util.Scanner;

public class Twopointers_Q2 {
    //Move all the even numbers at the begining.
    //Relative order does not matter.
    static void evenodd(int arr[])
    {
        int left=0;
        int right=arr.length-1;
        while(left<right)
        {
            if(arr[left]%2==1 && arr[right]%2==0)
            {
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
            if(arr[left]%2==0)
                left++;
            if(arr[right]%2==1)
                right--;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        evenodd(arr);

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
