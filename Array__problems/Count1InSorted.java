package Array__problems;

import java.util.Scanner;

public class Count1InSorted {

    static int count(int arr[])
    {
        int first=-1;
        int low=0;
        int high=arr.length-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]==1)
            {
                first=mid;
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        if(first==-1)
        {
            return 0;
        }
        else{
            //No.of 1's= last index-first index+1
            return arr.length-first;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:- ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements:- ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Count of 1's= "+count(arr));

    }
}
