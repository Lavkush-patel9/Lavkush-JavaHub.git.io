import java.util.Scanner;

public class PythagoreanTriple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();

        for (int a = 1 ; a<=limit ; a++)
        {
            for(int b = a+1 ; b<=limit ;b++){
            int c = (int) Math.sqrt(a*a + b*b);
            if (c*c == a*a + b*b && c <= limit)
            {
                System.out.println( a + " " + b + " " + c);
            }
        }
        
        }
        sc.close();
    }
}

