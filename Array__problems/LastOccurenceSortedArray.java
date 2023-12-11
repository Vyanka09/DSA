package Array__problems;

import java.util.Scanner;

public class LastOccurenceSortedArray {

    static int lastOccurence(int arr[],int key)
    {
        int ans=-1;
        int low=0;
        int high=arr.length-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]==key)
            {
                ans=mid;
                low=mid+1;
            }
            else if(arr[mid]<key)
            {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
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
        System.out.println("Enter the searching element:- ");
        int key=sc.nextInt();
        System.out.println(lastOccurence(arr,key));
    }
}
