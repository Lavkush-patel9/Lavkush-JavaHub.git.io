import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // for input from user
        System.out.println("enter the size of array = ");
        int size = sc.nextInt();
        int [] array = new int[size]; // allocate the memory
        int sum = 0; // for calculation the solution
        System.out.println("enter the element of the array = ");
        for(int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt(); // for input of element in array
            sum  += array[i]; // calculate the sum

        }
        System.out.println("the sum of array = " +sum); // for print the sum of array
        sc.close();
    }
}

