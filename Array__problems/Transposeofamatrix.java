package Array__problems;

import java.util.Scanner;

public class Transposeofamatrix {
    public static int[][] transpose(int [][]mat)
    {
        int ans[][]=new int[mat[0].length][mat.length];

        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                ans[j][i]=mat[i][j];
            }
        }
        return ans;
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
        int ans[][]=new int[col][row];
        ans=transpose(mat);
        for(int i=0;i< ans.length;i++)
        {
            for(int j=0;j<ans[i].length;j++)
            {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
