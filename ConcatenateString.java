import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class ConcatenateString {
    public static void main(String[] args) {
        //take input of string

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the string = ");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        
        String result = str1 + str2;
        System.out.println("the final string is = " + result);
        sc.close();
    }
}
