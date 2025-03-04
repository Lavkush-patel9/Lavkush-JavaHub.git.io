import java.util.Scanner;

public class LastOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the target value = ");
        int x = sc.nextInt(); // take input of target value
        int [] array = new int[5]; // allocate the memory of array
        System.out.println("enter the element of array = ");
        for(int i = 0; i < array.length; i++)
        {
            array[i] = sc.nextInt(); // take the input element in array
        }
        for(int i = array.length-1; i >= 0; i--)
        {
            if (array[i] == x)
            {
                System.out.println("the last occurrence is = " +i);
                break;
            }
        }
    }
}

