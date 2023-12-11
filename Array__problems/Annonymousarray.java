package Array__problems;
class Calculator{
    public int sum(int numbers[])
    {
        int result=0;
        for(int n:numbers)
        {
            result+=n;
        }
        return result;
    }
}
public class Annonymousarray {
    public static void main(String[] args) {
        Calculator cal=new Calculator();
        int res=cal.sum(new int[]{2,3,4,5,6,7});
        System.out.println(res);
    }
}
