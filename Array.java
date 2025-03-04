import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // for input from user
        int [] array = new int[5]; // allocate the memory
        int sum = 0; // for
        for(int i = 0; i < array.length; i++)
        {
            array[i] = sc.nextInt(); // for input of element in array
            sum = array[i]+sum; // calculate the sum
        }
        System.out.println("the sum of array = " +sum); // for print the sum of array
        sc.close();
    }
}

