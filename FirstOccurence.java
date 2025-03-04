import java.util.Scanner;

public class FirstOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array = ");
        int size = sc.nextInt(); //take the input size of array
        int [] array = new int[size]; // allocate the memory of this size
        System.out.println("enter the element of the array = ");
        for(int i=0; i<array.length; i++)
        {
            array[i] = sc.nextInt(); // take input element of array
        }
        System.out.println("enter the target value of x = ");
        int x = sc.nextInt(); // take input of target value

        boolean found = false;
        for(int i = 0; i<array.length; i++)
        { if(array[i] == x){
                System.out.println("the first occurrences is = " +i);
                found = true;
                break;
            }
        }
        if (!found){
            System.out.println("this element is not found in array ");
        }
    sc.close();
    }
}
