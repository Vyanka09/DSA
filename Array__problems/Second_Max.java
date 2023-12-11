package Array__problems;

import java.util.Scanner;

public class Second_Max {

    static int secondmax(int arr[])
    {
        int max=-999999999;
        int smax=-999999999;

        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }

        }

        for(int i=0;i<arr.length;i++)
        {
            if(smax<arr[i] && arr[i]<max)
            {
                smax=arr[i];
            }
        }

        return smax;


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

        System.out.println("Second max= "+secondmax(arr));
    }
}
