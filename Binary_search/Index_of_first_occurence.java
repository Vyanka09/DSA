package Binary_search;

import java.util.Scanner;

public class Index_of_first_occurence {

    static int binarysearch1stoccurence(int arr[],int target)
    {
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            //int mid=start+(end-start)/2;
            if(arr[mid]==target)
            {
                ans=mid;
                end=mid-1;
            }
            else if(arr[mid]<target)
            {
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return ans;
    }

    static int lastoccurence(int arr[],int target)
    {
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            //int mid=start+(end-start)/2;
            if(arr[mid]==target)
            {
                ans=mid;
                start=mid+1;
            }
            else if(arr[mid]<target)
            {
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //System.out.println("Enter the size of array- ");
        // int n=sc.nextInt();
        int[] arr={2,5,5,5,6,6,8,9,9,9};

        System.out.println("Enter the element to find its 1st occurence- ");
        int target=sc.nextInt();
        int k=binarysearch1stoccurence(arr,target);
        if(k==-1)
        {
            System.out.println("Element not found");
        }
        else {
            System.out.println("1st occurence at index "+k);
        }
        int l=lastoccurence(arr,target);
        if(l==-1)
        {
            System.out.println("Element not found");
        }
        else {
            System.out.println("last occurence at index "+l);
        }

    }
}
