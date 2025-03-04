import java.util.Scanner;

public class TriangleValidity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three sides of a triangle: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        
        if (a + b > c && a + c > b && b + c > a)
            System.out.println("Valid Triangle");
        else
            System.out.println("Not a Valid Triangle");
        
        sc.close();
    }
}
