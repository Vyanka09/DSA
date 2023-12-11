package Array__problems;

import java.util.Scanner;

public class LinearSearch {
    static int linearsearch(int arr[],int key)
    {
        int index=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                index=i;
                break;
            }
        }
        return index;
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
        int ans=linearsearch(arr, key);
        if(ans!=-1) {
            System.out.println("Index of the element= " +ans);
        }
        else{
            System.out.println("Element not found in the array");
        }
    }
}
