package Array__problems;

import java.util.Scanner;

public class Maximum {

    static int max(int arr[])
    {
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println("Enter size of array:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements:- ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Maximum element:- "+max(arr));
    }
}
