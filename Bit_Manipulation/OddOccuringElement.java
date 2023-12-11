package Bit_Manipulation;
import java.util.Scanner;
public class OddOccuringElement {
    static int oddoccuring(int arr[])
    {
        int result=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            result=result^arr[i];
        }
        return result;
    }
    //One element is odd ccuring and rest are even occuring.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:- ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(oddoccuring(arr));


    }
}
