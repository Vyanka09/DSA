package HashMap;
import java.util.HashMap;
import java.util.Scanner;
public class TwoSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array:- ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements:- ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target value:- ");
        int target=sc.nextInt();

        //Return index such that sum of 2 array elements become target.
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            hm.put(arr[i],i);
        }

        int ans[]=new int[2];
        ans[0]=-1;
        ans[1]=-1;
        for(int i=0;i<n;i++)
        {
            int k=target-arr[i];
            if(k==arr[i] && hm.containsKey(k)==true)
            {
                ans[0]=i;
                ans[1]=hm.get(arr[i]);
                break;
            }
            else if(k!=arr[i] && hm.containsKey(k)==true)
            {
                ans[0]=i;
                ans[1]=hm.get(k);
                break;
            }
        }

        for(int k:ans)
        {
            System.out.println(k);
        }


    }
}
