package Binary_search;

import java.util.Scanner;

public class Recursive_binary_search {
    static int binarysearch(int arr[], int start, int end, int target) {
        if (start > end) {
            return -1;
        } else {


            //int mid = (start + end) / 2;
            int mid=start+(end-start)/2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                return binarysearch(arr, mid + 1, end, target);
            } else {
                return binarysearch(arr, start, mid - 1, target);
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the size of array- ");
        // int n=sc.nextInt();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Enter the element to search- ");
        int target = sc.nextInt();
        int k = binarysearch(arr, 0, arr.length - 1, target);
        if (k == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + k);
        }
    }
}
