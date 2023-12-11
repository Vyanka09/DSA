package Array__problems;

import java.util.Scanner;

public class Arratrotate {


    static void reverse(int[] arr,int left,int right)
    {
        while(left<right)
        {
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
    static void rotate(int[] arr,int k)
    {
        k=k%arr.length;
        int n=arr.length;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
    }

    static int[] rotate_naive(int[] arr,int k)
    {
        int[] ans=new int[arr.length];
        int i=0;
        int n=arr.length;
        for(int j=n-k;j<n;j++)
        {
            ans[i]=arr[j];
            i++;
        }

        for(int j=0;j<n-k;j++)
        {
            ans[i]=arr[j];
            i++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:- ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the array elements:- ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter k:- ");
        int k=sc.nextInt();
        int[] ans=new int[n];
        ans=rotate_naive(arr,k);
        for(int y:ans)
        {
            System.out.print(y+" ");
        }
        System.out.println();
        rotate(arr,k);
        for(int s:arr)
        {
            System.out.print(s+" ");
        }

    }
}
