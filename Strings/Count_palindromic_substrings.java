package Strings;

import java.sql.SQLOutput;

public class Count_palindromic_substrings {
    static boolean isPalindrome(String k)
    {
        int i=0;
        int j=k.length()-1;
        while(i<j)
        {
            if(k.charAt(i)!=k.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str="abba";
        int n=str.length();
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<=n;j++)
            {
                if(isPalindrome(str.substring(i,j)))
                {
                    System.out.println(str.substring(i,j));
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
