package Array__problems;

import java.util.Scanner;

public class Twopointer_Q3 {
    //Return the squares of array elements in non-decreasing order.
    //Given array is in non-decreasing order.
    public static int[] sort(int arr[])
    {
        int k[]=new int[arr.length];
        int left=0;
        int right=arr.length-1;
        int j=0;
        while(left<=right)
        {
            if(arr[left]>=arr[right] || -arr[left]>=arr[right])
            {
                k[j]=arr[left]*arr[left];
                left++;
                j++;
            }
            if(arr[right]>arr[left] || -arr[right]>arr[left])
            {
                k[j]=arr[right]*arr[right];
                right--;
                j++;
            }
        }
        left=0;
        right=arr.length-1;
        while(left<right)
        {
            int temp=k[left];
            k[left]=k[right];
            k[right]=temp;
            left++;
            right--;
        }

        return k;
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
        int ans[]=new int[arr.length];
        ans=sort(arr);

        for(int i=0;i<ans.length;i++)
        {
            System.out.println(ans[i]);
        }
    }
}
