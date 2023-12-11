package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeating {

    static int firstnonrepeat(String str)
    {
        HashMap<Character,Integer>hm=new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            if(hm.containsKey(str.charAt(i))==true)
            {
                int temp=hm.get(str.charAt(i));
                hm.put(str.charAt(i),++temp);
            }
            else{
                hm.put(str.charAt(i),1);
            }
        }

        for (int i=0;i<str.length();i++)
        {
            if(hm.get(str.charAt(i))==1)
            {
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(firstnonrepeat(str));
    }
}
