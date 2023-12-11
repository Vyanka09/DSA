package Array__problems;

import java.util.Scanner;

public class Array_query_question {

    static int[] makefreqarray(int arr[])
    {
        int[] freq=new int[100005];
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            freq[arr[i]]++;
        }
        return freq;
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
        System.out.println("Enter no of queries:- ");
        int q=sc.nextInt();
        int[] freq=new int[100005];
        freq=makefreqarray(arr);
        while(q>0)
        {
            System.out.println("Enter the searching element:- ");
            int j=sc.nextInt();
            if(freq[j]>0)
            {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
            q--;
        }
    }
}
