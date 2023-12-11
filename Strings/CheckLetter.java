package Strings;

public class CheckLetter {
    public static void main(String[] args) {
        String str="Umbrella";
        int flag=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='e')
            {
                flag=1;
                System.out.println("e is present in "+str);
                break;
            }
        }
        if (flag==0)
        {
            System.out.println("e is not present in "+str);
        }

    }
}
