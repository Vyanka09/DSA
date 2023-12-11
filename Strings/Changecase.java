package Strings;

import java.util.Scanner;

public class Changecase {

    static String changecase(String str)
    {
        char ch[]=str.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]>='a' && ch[i]<='z')
            {
                ch[i]=(char)(ch[i]-32);
            }
            else if(ch[i]>='A' && ch[i]<='Z')
            {
                ch[i]=(char)(ch[i]+32);
            }

        }
        return String.valueOf(ch);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string:- ");
        String str=sc.nextLine();
        String ans=changecase(str);
        System.out.println(ans);
    }
}
