import java.util.Scanner;

public class Fibbonaci {
    public static void main(String[] args) {
        // take input  for print the fibonacci series 

        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 1;
        System.out.println("enter the number = ");
        int n = sc.nextInt();

        System.out.println("the series is " + a + " " + b + " ");

        for (int i = 2 ; i < n ; i++)
        {
            int result = a + b;
            System.out.println(result + " ");
            a = b;
            b = result;
        }
        sc.close();
    }
}
