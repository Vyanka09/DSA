package Strings;

public class Compare2 {
    public static void main(String[] args) {
        String s1="PW";
        String s2="pW";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.compareTo(s2));
    }
}
