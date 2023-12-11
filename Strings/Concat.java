package Strings;

public class Concat {
    public static void main(String[] args) {
        //String s1=new String("PW");
//        s1.concat(" Skill");
//        System.out.println(s1); PW

//        s1=s1.concat(" Skill");
//        System.out.println(s1);
//
//        s1="PW";
//        String s2=s1.concat(" Skill");
//        String s3=new String("PWjava");
//        s3=s3.concat(" Skill");
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);

        String s1="PW";
        String s2="PW"+" java";
        String s3=s1+s2;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("PW"+100+99);
    }
}
