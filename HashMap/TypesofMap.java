package HashMap;

import java.util.*;

public class TypesofMap {
    public static void main(String[] args) {
        //Unordered collction
        HashMap<Integer,String>hm=new HashMap<>();
        hm.put(7,"Dhoni");
        hm.put(10,"Sachin");
        hm.put(18,"Kohli");
        hm.put(45,"Rohit");

        System.out.println("Hashmap of data is "+hm);

        //Order of insertion is preserved
        LinkedHashMap<Integer,String>hm2=new LinkedHashMap<>();
        hm2.put(7,"Dhoni");
        hm2.put(18,"Kohli");
        hm2.put(10,"Sachin");

        hm2.put(45,"Rohit");

        System.out.println("LinkedHashmap of data is "+hm2);

        //Output based on sorted keys
        TreeMap<Integer,String>hm3=new TreeMap<>();
        hm3.put(7,"Dhoni");
        hm3.put(10,"Sachin");
        hm3.put(18,"Kohli");
        hm3.put(45,"Rohit");

        System.out.println("Treemap of data is "+hm3);


    }
}
