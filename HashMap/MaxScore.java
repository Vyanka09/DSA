package HashMap;


    /*
     * Save this in a file called Main.java and compile it. To test it
     * create the file `input.txt` in the workspace / Working Directory
     * (For Eclipse/VisualStudio, by default this is the top level project folder)
     */

    /* Do not add a package declaration */
import java.util.*;
import java.io.*;

    /* DO NOT CHANGE ANYTHING ABOVE THIS LINE */
/* You may add any imports here, if you wish, but only from the
   standard library */

    /* Do not add a namespace declaration */
    public class MaxScore {
        public static Map<String,Integer> processData(ArrayList<String> array) {
            /*
             * Modify this method to process `array` as indicated
             * in the question. At the end, return a Map containing
             * the appropriate values
             *
             * Please create appropriate classes, and use appropriate
             * data structures as necessary.
             *
             * Do not print anything in this method.
             *
             * Submit this entire program (not just this method)
             * as your answer
             */
            Map<String,Integer> atheleteMap = new HashMap<String,Integer>();
            Map<String,Integer>highestpoints=new HashMap<String, Integer>();
            for(String data:array)
            {
                String[] parts=data.split(",");
                if(parts.length==5)
                {
                    String id=parts[0];
                    String name=parts[1];
                    String event=parts[2];

                    int time=Integer.parseInt(parts[3].trim());
                    int points=Integer.parseInt(parts[4].trim());
                   // System.out.println(time);
                    if(!highestpoints.containsKey(name) || points>highestpoints.get(name))
                    {
                        highestpoints.put(name,points);
                        atheleteMap.put(name,time);
                      //  System.out.println(atheleteMap.get(name));
                    }
                  //  System.out.println(highestpoints.get(name));
                }
            }
            return atheleteMap;
        }

        public static void main (String[] args) {
            ArrayList<String> inputData = new ArrayList<String>();
            String line;
            try {
                Scanner in = new Scanner(new BufferedReader(new FileReader("C:\\Users\\Admin\\IdeaProjects\\Methods_and_oops\\src\\HashMap\\input.txt")));
                while(in.hasNextLine())
                    inputData.add(in.nextLine());
                Map<String,Integer> retVal = processData(inputData);
                PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("C:\\Users\\Admin\\IdeaProjects\\Methods_and_oops\\src\\HashMap\\output.txt")));
                for(Map.Entry<String,Integer> e: retVal.entrySet())
                    output.println(e.getKey() + ": " + e.getValue());
                output.close();
            } catch (IOException e) {
                System.out.println("IO error in input.txt or output.txt");
            }
        }
    }


