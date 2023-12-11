package Array__problems;

import java.util.Scanner;

public class Largest2D {

    static int max(int mat[][])
    {
        int max=-999999999;
        for(int i=0;i< mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                if(max<mat[i][j])
                {
                    max=mat[i][j];
                }
            }

        }
        return max;


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
        System.out.println("Largest element:- "+max(mat));
    }
}
