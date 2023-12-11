package Array__problems;

import java.util.Scanner;

public class sortarrayof0and1 {

    public static void sort0sand1s(int[] arr)
    {
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                c++;
            }
        }

        for(int i=0;i<c;i++)
        {
            arr[i]=0;
        }

        for(int j=c;j<arr.length;j++)
        {
            arr[j]=1;
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
        {
            System.out.println(arr[i]);
        }
    }
}
