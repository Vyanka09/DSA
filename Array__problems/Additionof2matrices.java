package Array__problems;

import java.util.Scanner;

public class Additionof2matrices {

    public static int[][] addition(int mat1[][],int mat2[][])
    {
        int ans[][]=new int[mat1.length][mat1[0].length];
        for(int i=0;i<mat1.length;i++)
        {
            for(int j=0;j<mat1[i].length;j++)
            {
                ans[i][j]=mat1[i][j]+mat2[i][j];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of rows");
        int row=sc.nextInt();
        System.out.println("Enter no.of columns");
        int col=sc.nextInt();

        int mat1[][]=new int[row][col];
        int mat2[][]=new int[row][col];

        int mat3[][];
        System.out.println("Enter 1st matrix elements: ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                mat1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter 2nd matrix elements: ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
               mat2[i][j]=sc.nextInt();
            }
        }

        mat3=addition(mat1,mat2);

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(mat3[i][j]+" ");
            }
        }

    }
}
