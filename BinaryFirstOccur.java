import java.util.Scanner;

public class BinaryFirstOccur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //take input of size of the array
        System.out.println("enter the size of array = ");
        int size = sc.nextInt();
        int [] arr = new int[size]; // array declaration and initialization of array
        //take the input of array element and array must be sorted
        System.out.print("enter the array element = ");
        for(int i=0 ; i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        // take input target value
        System.out.println("enter the target value = ");
        int key = sc.nextInt();
        int ans = FirstOccurrences(arr, key, 0,arr.length-1);
        System.out.println("the first occurrences is = " +ans);

    }
    public static int FirstOccurrences(int []arr , int key , int start , int end)
    {
        int result = -1;
        while (start <= end ) // its execute till that start is smaller and not equal end
        {
            int mid = start + (end-start) / 2; // find the mid-element in the array

            if(arr[mid] == key) {
                result = mid; // store the value of mid in new variable
                end = mid-1; // for continue searching element for first occurrence
            } else if (arr[mid] < key) { // its compare the mid or key value if mid is smaller than key value move the start pointer mid+1
                start = mid + 1;
            } else if (arr[mid]>key) { // its also move the end pointer mid-1
                end = mid - 1;
            }
        }
        return result;
    }
}
