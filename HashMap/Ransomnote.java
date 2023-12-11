package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class Ransomnote {

    static boolean construct(String ransomnote,String magazine)
    {
        HashMap<Character,Integer>hm=new HashMap<>();
        for(int i=0;i<magazine.length();i++)
        {
            if(hm.containsKey(magazine.charAt(i)))
            {
                int temp=hm.get(magazine.charAt(i));
                hm.put(magazine.charAt(i),++temp);
            }
            else{
                hm.put(magazine.charAt(i),1);
            }
        }

        for(int i=0;i<ransomnote.length();i++)
        {
            if(hm.containsKey(ransomnote.charAt(i))==false)
            {
                return false;
            }
            if(hm.containsKey(ransomnote.charAt(i)) && hm.get(ransomnote.charAt(i))==0)
            {
                return false;
            }
            else{
                int temp=hm.get(ransomnote.charAt(i));
                hm.put(ransomnote.charAt(i),--temp);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ransomnote and magazine value:- ");
        String ransomnote=sc.next();
        String magazine=sc.next();
        System.out.println(construct(ransomnote,magazine));
    }
}
