package HashMap;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class LargestElement {
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
        TreeMap<Integer,Integer>tm=new TreeMap<>();
        for (int i=0;i<n;i++)
        {
            tm.put(arr[i],1);
        }
        System.out.println("Largest element:- "+tm.lastKey());
    }
}
