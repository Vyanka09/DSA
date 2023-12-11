package Strings;


public class DeleteConsonants {
    public static void main(String[] args) {
//        String str="Hello, have a good day.";
//     String temp="";
//      for(int i=0;i<str.length();i++)
//      {
//          if(str.charAt(i)=='A' || str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='E' ||
//         str.charAt(i)=='I' || str.charAt(i)=='i' || str.charAt(i)=='O' || str.charAt(i)=='o' ||
//          str.charAt(i)=='u' || str.charAt(i)=='U' || str.charAt(i)=='.' || str.charAt(i)==',' || str.charAt(i)==' ')
//          {
//              temp=temp+str.charAt(i);
//           }
//       }
//    str=""+temp;
// System.out.println(str);



StringBuilder str=new StringBuilder("Hello, have a good day.");


                for(int i=0;i<str.length();i++)
                {
                    if(str.charAt(i)=='A' || str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='E' ||
                            str.charAt(i)=='I' || str.charAt(i)=='i' || str.charAt(i)=='O' || str.charAt(i)=='o' ||
                            str.charAt(i)=='u' || str.charAt(i)=='U' || str.charAt(i)=='.' || str.charAt(i)==',' 
                    )
                    {
                        continue;
                    }
                    else{
                        str.deleteCharAt(i);
                    }

                }
                System.out.println(str);
            }





    }

