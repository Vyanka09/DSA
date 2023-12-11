package Array__problems;

public class Swap {

    static void swap(int a,int b)
    {
        System.out.println("a= "+a+" b= "+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a= "+a+" b= "+b);
    }

    static void swap2(int a,int b)
    {
        System.out.println("a= "+a+" b= "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a= "+a+" b= "+b);
    }

    public static void main(String[] args) {
        int a=3,b=9;
        swap2(a,b);

    }
}
