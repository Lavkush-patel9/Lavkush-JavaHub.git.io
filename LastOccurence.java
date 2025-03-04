
import java.util.Scanner;

public class LastOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] array = new int[size]; // allocate the memory of array dynamically
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt(); // take the input element in array
        }
        System.out.print("Enter the target value: ");
        int x = sc.nextInt(); // take input of target value

        // Finding the last occurrence
        int lastIndex = -1;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == x) {
                lastIndex = i;
                break;
            }
        }

        if (lastIndex != -1) {
            System.out.println("The last occurrence is at index: " + lastIndex);
        } else {
            System.out.println("The target value is not present in the array.");
        }

        sc.close(); // close the scanner
    }
}

