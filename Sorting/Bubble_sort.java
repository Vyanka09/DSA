package Sorting;

public class Bubble_sort {
    static void bubblesort(int arr[])
    {
        int n=arr.length;
        boolean flag=false;

        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    flag=true;
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
            if(flag==false)
                break;
        }
    }
    public static void main(String[] args) {
        int arr[]={2,5,1,0,7,4,3};
        bubblesort(arr);
        //System.out.println(arr.toString());
        for(int k:arr)
        {
            System.out.println(k);
        }
    }
}
