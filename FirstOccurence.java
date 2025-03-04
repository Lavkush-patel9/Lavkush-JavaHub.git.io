import java.util.Scanner;


public class FirstOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the target value = ");
        int x = sc.nextInt();
        int [] array = new int[5];
        System.out.println("enter the element of array = ");
        for(int i = 0; i < array.length;i++)
        {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == x )
            {
                System.out.println("the first occurence is =" +i);
                break;
            }

        }
    }
}
