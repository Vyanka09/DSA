package HashMap;



import java.util.Scanner;
import java.util.TreeMap;

public class SortedValues {
    public static void main(String[] args) {
        TreeMap<String,Integer>tm=new TreeMap<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size:- ");
        int n= sc.nextInt();
        for (int i=0;i<n;i++)
        {
            int key=sc.nextInt();
            String value=sc.next();
            tm.put(value,key);

        }
        System.out.println(tm);

    }
}
