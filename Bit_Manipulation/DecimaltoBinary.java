package Bit_Manipulation;

import java.util.Scanner;

public class DecimaltoBinary {

    static int dectoBinary(int n)
    {
        int res=0;
        int pow=1;
        while(n!=0)
        {
            res=res+(n%2)*pow;
            pow*=10;
            n/=2;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:- ");
        int n=sc.nextInt();
        System.out.println("Binary= "+dectoBinary(n));
    }
}
