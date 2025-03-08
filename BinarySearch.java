
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the array size = ");
        int n = sc.nextInt();
        int [] arr = new int[n]; // declaration of array
        // array input for
        System.out.print("enter the array element = ");
        for(int i = 0; i < arr.length ; i++) {
            arr[i] = sc.nextInt();
        }
        // take input the target value key
        System.out.print("enter the target value = ");
        int key = sc.nextInt();

        int result = binarySearch(arr, key, 0,arr.length-1);
        if (result == -1)
        {
            System.out.println("the element is not found ");
        }
        else {
            System.out.println("this element is found at index  = " +result);
        }
        sc.close();

    }
    public static int binarySearch(int []arr , int key , int start , int end)
    {
        while(start < end )
        {
          int mid = (start +(end -start) / 2); // find the mid-value
            if(arr[mid] == key)
            {
                return mid;
            }
            else if (arr[mid] < key)
            {
                start = mid + 1;
            }
            else if (arr[mid]>key)
            {
                end = mid - 1;
            }
        }
        return -1;
    }
}
