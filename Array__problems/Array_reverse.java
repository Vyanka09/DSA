package Array__problems;

public class Array_reverse {



    static void reverse(int arr[])
    {
        int n=arr.length;
        int left=0;
        int right=n-1;

        while(left<=right)
        {
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        reverse(arr);


       
        for(int z:arr)
        {
            System.out.println(z);
        }


    }
}
