package Array__problems;

import java.util.Scanner;

public class Transposeinplace {
    public static void transpose(int [][]mat)
    {
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                if(i<j)
                {
                    int temp=mat[i][j];
                    mat[i][j]=mat[j][i];
                    mat[j][i]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows and columns:- ");
        int row=sc.nextInt();
        int col=sc.nextInt();
        int mat[][]=new int[row][col];
        for(int i=0;i< mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                mat[i][j]=sc.nextInt();
            }

        }
        transpose(mat);
        for(int i=0;i< mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                //mat[i][j]=sc.nextInt();
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();

        }

    }
}
