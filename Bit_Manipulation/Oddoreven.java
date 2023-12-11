package Bit_Manipulation;

import java.util.Scanner;

public class Oddoreven {
    static boolean even(int n)
    {
        if((n & 1)==0)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:- ");
        int n=sc.nextInt();
        if(even(n))
        {
            System.out.println(n+" is even.");
        }
        else{
            System.out.println(n+" is odd.");
        }
    }
}
