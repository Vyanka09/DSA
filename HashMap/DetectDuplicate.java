package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class DetectDuplicate {

    static boolean duplicate(int arr[])
    {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i< arr.length;i++)
        {
            if(hm.containsKey(arr[i]))
            {
                return true;
            }
            else{
                hm.put(arr[i],1);
            }
        }

        return false;


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:- ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements:- ");
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        if(duplicate(arr))
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
