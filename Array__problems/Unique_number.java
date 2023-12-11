package Array__problems;

import java.util.Scanner;

public class Unique_number {

    static int unique(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    arr[i]=arr[j]=-1;
                    break;
                }

            }
        }

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>0)
            {
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:- ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements:- ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Unique number = "+unique(arr));
    }
}
