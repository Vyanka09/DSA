package Array__problems;

import java.util.Scanner;

public class Prefixsumbruteforce {
    public static void main(String[] args) {
        int [][]mat={{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        Scanner sc=new Scanner(System.in);
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int r2=sc.nextInt();
        int c2=sc.nextInt();

        int sum=0;
        for(int i=r1;i<=r2;i++)
        {
            for(int j=c1;j<=c2;j++)
            {
                sum+=mat[i][j];
            }
        }
        System.out.println(sum);
    }
}
