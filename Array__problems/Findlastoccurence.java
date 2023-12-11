package Array__problems;

import java.util.Scanner;

public class Findlastoccurence {

    static int lastoccur(int arr[],int x)
    {
        int ans=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==x)
                ans=i;
        }

        return ans;
    }
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:- ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements:- ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element for finding last occurence:- ");
        int x=sc.nextInt();
        System.out.println(lastoccur(arr,x));
    }

}
