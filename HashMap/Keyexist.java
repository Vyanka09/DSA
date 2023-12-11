package HashMap;

import java.util.HashMap;

public class Keyexist {
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(7,"Dhoni");
        hm.put(10,"Sachin");
        hm.put(18,"Kohli");
        hm.put(45,"Rohit");
        System.out.println("Key 7:- "+hm.containsKey(7));
        System.out.println("Key 18:- "+hm.containsKey(14));
    }
}
