public class Palindrome {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 1}; // Input array
        boolean isPalindrome = true;   // Flag to check palindrome

        int i = 0, j = array.length - 1;

        while (i < j) {
            if (array[i] != array[j]) {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }

        if (isPalindrome) {
            System.out.println("The array is a palindrome.");
        } else {
            System.out.println("The array is NOT a palindrome.");
        }
    }
}
