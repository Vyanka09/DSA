package Array__problems;

import java.util.Scanner;

public class PalindromeArray {

    public static boolean ispalindrome(int arr[])
    {
        int left=0;
        int right=arr.length-1;
        boolean flag=true;
        while(left<right)
        {
            if(arr[left]!=arr[right])
            {
                flag=false;
                break;
            }
            left++;
            right--;
        }
        return flag;
    }
    public static void main(String[] args) {
        System.out.println("Enter size of array:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        if(ispalindrome(arr))
        {
            System.out.println("Array is palindrome");
        }
        else{
            System.out.println("Array is not palindrome");
        }

    }
}
