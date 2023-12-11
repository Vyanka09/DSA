package Array__problems;

public class TwoDarrayintro {
    public static void main(String[] args) {
        int a[][]=new int[2][3];
        int a2[][]={{1,2,3},{4,5,6},{7,8,9}};

        for(int i=0;i<a2.length;i++)
        {
            for(int j=0;j<a2[i].length;j++)
            {
                System.out.println(a2[i][j]);
            }
        }
    }
}
