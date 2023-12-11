package Array__problems;

import java.util.Scanner;

public class PrintAboveSecondaryDiagonal {

    static void printAboveSecondary(int mat[][])
    {
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                if(i+j<mat.length-1)
                {
                    System.out.print(mat[i][j]+" ");
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows and columns:- ");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int mat[][]=new int[m][n];
        System.out.println("Enter array elements:- ");
        for(int i=0;i< mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                mat[i][j]=sc.nextInt();
            }

        }
        printAboveSecondary(mat);
    }
}
