package Array__problems;

import java.util.Scanner;

public class PrintMiddle {

    static void printMiddle(int mat[][])
    {
        int m=mat.length;
        int n=mat[0].length;

        for(int i=0;i<m;i++)
        {
            System.out.print(mat[i][n/2]+" ");
        }

        for(int j=0;j<n;j++)
        {
            if(j!=n/2)
            System.out.print(mat[m/2][j]+" ");
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
        printMiddle(mat);
    }
}
