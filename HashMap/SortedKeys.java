package HashMap;

import java.util.Scanner;
import java.util.TreeMap;

public class SortedKeys {
    public static void main(String[] args) {
        TreeMap<Integer,String>tm=new TreeMap<>();
        System.out.println("Enter size:- ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int key=sc.nextInt();
            String value=sc.next();
            tm.put(key,value);
        }
        System.out.println(tm);
    }
}
