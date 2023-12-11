package Array__problems;

import java.util.Scanner;

public class twopointer_sort0and1 {

    static void sort0sand1s(int arr[])
    {
        int n=arr.length;
        int left=0;
        int right=n-1;

        while(left<right)
        {
            if(arr[left]==1 && arr[right]==0)
            {
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
            }

            if(arr[left]==0)
                left++;

            if(arr[right]==1)
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

        sort0sand1s(arr);

for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");

    }
}
