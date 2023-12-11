package Bit_Manipulation;

import java.util.Scanner;

public class CountNoofSetBits {
    static int setBits(int n)
    {
        int count=0;
        while(n!=0)
        {
            if((n & 1)!=0)
            {
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:- ");
        int n=sc.nextInt();
        System.out.println("No.of set bits= "+setBits(n));
    }
}
