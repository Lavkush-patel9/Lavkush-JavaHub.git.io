import java.util.Scanner;

public class CountVowel {
    public static void main(String[] args) {
        String vowels = "aeiouAEIOU";
        String consonants = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the string = ");
        //this for only one char input
        String str = sc.next();

        if (str.length() == 1) // check the length of char
        {
        if (vowels.contains(str) )
        {
            System.out.println("this is vowel");
        }
        else if (consonants.contains(str))
        {
            System.out.println("this  is consonent");
        }
        else
        {
            System.out.println("this is invalid input..");
        }
        }
        sc.close();
    }
}
