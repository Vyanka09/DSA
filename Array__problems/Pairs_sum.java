package Array__problems;

import java.util.Scanner;

public class Pairs_sum {

    static int countpairs(int arr[], int x)
    {
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==x)
                    c++;
            }
        }
        return c;
    }

    static int count_triplet(int arr[],int x)
    {
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                for(int k=j+1;k<arr.length;k++)
                {
                    if(arr[i]+arr[j]+arr[k]==x)
                    {
                        c++;
                    }
                }
            }
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:- ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements:- ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter x:- ");
        int x=sc.nextInt();
        int c=countpairs(arr,x);
        System.out.println("Total pairs= "+c);

        int c2=count_triplet(arr,x);
        System.out.println("Total triplets= "+c2);

    }



}
