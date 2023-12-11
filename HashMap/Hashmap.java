package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer,String>hm=new HashMap<>();
        hm.put(7,"Dhoni");
        hm.put(10,"Sachin");
        hm.put(18,"Kohli");
        hm.put(45,"Rohit");

        System.out.println("Hashmap of data is "+hm);
        System.out.println(hm.get(10));
        System.out.println(hm.get(1535));//returns null if key is not present.

        System.out.println(hm.containsKey(7));//Returns true if key is present
        
        //Remove function
        hm.remove(10);
        System.out.println("Updated hashmap "+hm);

        //Iterating using for loop

        for(Map.Entry<Integer,String>e:hm.entrySet())
        {
            System.out.println(e.getKey()+":"+e.getValue());
        }

    }
}
