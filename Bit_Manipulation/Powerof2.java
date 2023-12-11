package Bit_Manipulation;

import java.util.Scanner;

public class Powerof2 {
    static boolean powerof2(int n)
    {
        if((n & (n-1))==0)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:- ");
        int n=sc.nextInt();
        System.out.println(powerof2(n));
    }
}
