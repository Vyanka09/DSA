package Array__problems;

import java.util.Scanner;

public class TwoDimensional {
    static int countpositive(int mat[][])
    {
        int count=0;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                if(mat[i][j]>0)
                    count++;
            }
        }
        return count;
    }
    static int countnegative(int mat[][])
    {
        int count=0;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                if(mat[i][j]<0)
                    count++;
            }
        }
        return count;
    }

    static int countodd(int mat[][])
    {
        int count=0;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                if(mat[i][j]%2!=0)
                    count++;
            }
        }
        return count;
    }

    static int counteven(int mat[][])
    {
        int count=0;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                if(mat[i][j]%2==0)
                    count++;
            }
        }
        return count;
    }

    static int countzero(int mat[][])
    {
        int count=0;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                if(mat[i][j]==0)
                    count++;
            }
        }
        return count;
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

        System.out.println("Number of positive numbers= "+countpositive(mat));
        System.out.println("Number of negative numbers= "+countnegative(mat));
        System.out.println("Number of odd numbers= "+countodd(mat));
        System.out.println("Number of even numbers= "+counteven(mat));
        System.out.println("Number of 0= "+countzero(mat));

    }
}
