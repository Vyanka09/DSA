package Array__problems;

import java.util.Scanner;

public class ThreeDMax {

    static void processArray(int arr[],int j)
    {
        int ans=Integer.MIN_VALUE;

        for(int i=0;i<j;i++)
        {
            if(arr[i]>=100 && arr[i]<=999)
            {
                if(ans<=arr[i])
                {
                    ans=arr[i];
                }

                if(i!= arr.length-1 && (arr[i+1]<100 || arr[i+1]>999))
                {
                    System.out.println(ans);
                    ans=Integer.MIN_VALUE;
                }
            }
            else{
                System.out.println(arr[i]);
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[1000];
        int i=0;
        while (true)
        {
            int temp=sc.nextInt();
            if(temp<0)
            {
                break;
            }
            arr[i]=temp;
            i++;
        }
        processArray(arr,i);
    }
}
