package Array__problems;

public class Arraydemo {

    static void demoarray()
    {
        int ages[]=new int[4];
        ages[0]=20;
        ages[1]=45;
        ages[2]=56;
        ages[3]=67;
        System.out.println(ages[2]);

        int k[]={1,2,3,4,5};
        System.out.println(k[4]);

        int multi[][]=new int[3][2];
        multi[0][1]=67;
        System.out.println(multi[0][0]);
        System.out.println(ages.length);

        //Accessing using for loop
        for(int i=0;i<ages.length;i++)
        {
            System.out.print(ages[i]+" ");
        }

        //Accesing using for-each loop
        for(int Z:ages)
        {
            System.out.print(Z+" ");
        }

        //Accessing using while loop
        int j=0;
        while(j< ages.length)
        {
            System.out.println(ages[j]);
            j++;
        }

        for(int a[]:multi)
        {
            for(int k5:a)
            {
                System.out.println(k5);
            }
        }
    }
    public static void main(String[] args) {
        demoarray();
    }
}
