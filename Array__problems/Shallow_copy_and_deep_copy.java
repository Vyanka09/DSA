package Array__problems;

import java.util.Scanner;

public class Shallow_copy_and_deep_copy {
    static void printarray(int arr[])
    {
        for(int i=0;i<arr.length;i++)
    {
        System.out.print(arr[i]+" ");
    }
        System.out.println();

    }


        public static void main(String[] args) {
            int arr[]=new int[5];
            Scanner sc=new Scanner(System.in);
            for(int i=0;i<arr.length;i++)
            {
                arr[i]=sc.nextInt();
            }

           // System.out.println(sum(arr));
//Shallow copy
            int arr2[]=arr;
            arr2[0]=5;
            arr2[1]=10;

            printarray(arr);
            printarray(arr2);

//Deep copy
            int arr3[]=arr.clone();
            printarray(arr3);
            arr3[0]=6788;
            arr3[1]=457;
            printarray(arr);
            printarray(arr3);

    }
}
