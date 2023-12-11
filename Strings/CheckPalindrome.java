package Strings;

import java.util.Scanner;

public class CheckPalindrome {
    static boolean palindrome(String str)
    {
        int low=0;
        int high=str.length()-1;

        while (low<high)
        {
            if(str.charAt(low)!=str.charAt(high))
            {
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string:- ");
        String str=sc.nextLine();
        if(palindrome(str))
        {
            System.out.println(str+" is palindrome.");
        }
        else{
            System.out.println(str+" is not palindrome.");
        }
    }
}
