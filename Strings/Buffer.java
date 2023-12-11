package Strings;

public class Buffer {
    public static void main(String[] args) {
        StringBuffer str=new StringBuffer("Hello");
        str.setCharAt(0,'M');
        System.out.println(str);
        str.append("Hello");
        System.out.println(str);
        str.insert(2,'k');
        System.out.println(str);
        str.reverse();
        System.out.println(str);
        str.reverse();
        System.out.println(str);
        str.deleteCharAt(1);
        System.out.println(str);
        str.delete(3,4);
        System.out.println(str);


    }
}
