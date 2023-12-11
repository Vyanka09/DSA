package Array__problems;

import java.util.Scanner;

public class Multiplicationof2matrices {
    public static int[][]multiplication(int[][]mat1,int[][]mat2)
    {
        int[][]ans=new int[mat1.length][mat2[0].length];
        for(int i=0;i<mat1.length;i++)
        {
            for(int j=0;j<mat2.length;j++)
            {
                for(int k=0;k<mat2[j].length;k++)
                {
                    ans[i][k]+=mat1[i][j]*mat2[j][k];
                }
            }
        }


        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of rows of 1st matrix");
        int row1=sc.nextInt();
        System.out.println("Enter no.of columns for 1st matrix");
        int col1=sc.nextInt();

        int mat1[][]=new int[row1][col1];
        int row2=col1;
        System.out.println("Enter no.of columns for 2nd matrix");
        int col2=sc.nextInt();
        int mat2[][]=new int[row2][col2];

        int mat3[][];
        System.out.println("Enter 1st matrix elements: ");
        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<col1;j++)
            {
                mat1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter 2nd matrix elements: ");
        for(int i=0;i<row2;i++)
        {
            for(int j=0;j<col2;j++)
            {
                mat2[i][j]=sc.nextInt();
            }
        }

        mat3=multiplication(mat1,mat2);

        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<col2;j++)
            {
                System.out.print(mat3[i][j]+" ");
            }
        }
    }
}
