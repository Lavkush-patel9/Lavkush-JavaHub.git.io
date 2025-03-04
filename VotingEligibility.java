import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Are you a citizen (true/false)? ");
        boolean isCitizen = sc.nextBoolean();
        
        if (age >= 18 && isCitizen)
            System.out.println("Eligible to Vote.");
        else
            System.out.println("Not Eligible to Vote.");
        
        sc.close();
    }
}
