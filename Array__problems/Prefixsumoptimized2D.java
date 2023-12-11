package Array__problems;

import java.util.Scanner;

public class Prefixsumoptimized2D {

    static void makeprefixsumarray(int[][]mat)
    {
        int m=mat.length;
        int n=mat[0].length;

        //Traverse row-major order and make prefix array
        for(int i=0;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                mat[i][j]+=mat[i][j-1];
            }
        }

        //Traverse column-major order and make prefix array
        for(int j=0;j<n;j++)
        {
            for(int i=1;i<m;i++)
            {
                mat[i][j]+=mat[i-1][j];
            }
        }
    }

    static int prefixsum(int [][]mat,int r1,int c1,int r2,int c2)
    {
        int result=0;
        int cal=mat[r2][c2];
        int left,upp,repeat;
        left=upp=repeat=0;

        if(c1>0)
            left=mat[r2][c1-1];

        if(r1>0)
            upp=mat[r1-1][c2];

        if(r1>0 && c1>0)
            repeat=mat[r1-1][c1-1];

        result=cal-upp-left+repeat;
        return result;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of rows:- ");
        int m=sc.nextInt();
        System.out.println("Enter no.of columns:- ");
        int n=sc.nextInt();
        int mat[][]=new int[m][n];
        System.out.println("Enter the elements:- ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        makeprefixsumarray(mat);
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.println(mat[i][j]);
            }
        }
        System.out.println("Enter r1,c1,r2,c2 :- ");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int r2= sc.nextInt();
        int c2= sc.nextInt();
        int result=prefixsum(mat,r1,c1,r2,c2);
        System.out.println(result);
    }
}
