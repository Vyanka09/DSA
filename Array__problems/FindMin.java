package Array__problems;

import java.util.Scanner;

public class FindMin {
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

//        for(int j=0;j<i;j++)
//        {
//            System.out.println(arr[j]+" ");
//        }
        int ans=Integer.MAX_VALUE;
        for(int j=0;j<i;j++)
        {
            if(arr[j]>=100 && ans>arr[j])
            {
                ans=arr[j];
            }
        }
        if(ans==Integer.MAX_VALUE)
        {
            ans=0;
        }
        System.out.println(ans);
    }
}
