package Strings;

public class Concatenation {
    public static void main(String[] args) {
        //Using + operator
        String str1="PW";
        String str2=str1+" Skills "+" Java";
        System.out.println(str2);

        //Using concat
        String str=new String("Virat");
        String str3=str.concat(" Kohli");
        System.out.println(str3);
    }
}
