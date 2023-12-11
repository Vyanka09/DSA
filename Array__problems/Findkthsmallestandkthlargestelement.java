package Array__problems;

import java.util.Arrays;
import java.util.Scanner;

public class Findkthsmallestandkthlargestelement {

    static int[] kthsmallestandlargest(int arr[],int k)
    {
        Arrays.sort(arr);
        int ans[]=new int[2];
        if(k<=arr.length)
        {
            ans[0]=arr[k-1];
            ans[1]=arr[arr.length-k];
        }
        else{
            ans[0]=ans[1]=-1;
        }
        return ans;

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
        int ans[]=new int[2];
        System.out.println("Enter k:- ");
        int k=sc.nextInt();
        ans=kthsmallestandlargest(arr,k);
        for(int z:ans)
        {
            System.out.println(z+" ");
        }

    }
}
