package Array__problems;

import java.util.Scanner;

public class Rotateby90clockwise {

        public static void rotateby90degrees(int [][]mat)
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

            for(int i=0;i<mat.length;i++)
            {
                int low=0;
                int high=mat[i].length-1;
                while(low<high)
                {
                    int temp=mat[i][low];
                    mat[i][low]=mat[i][high];
                    mat[i][high]=temp;
                    low++;
                    high--;
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
           rotateby90degrees(mat);
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
