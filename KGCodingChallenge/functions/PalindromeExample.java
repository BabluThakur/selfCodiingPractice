
package functions;

import java.util.Scanner;

public class PalindromeExample {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        boolean     palindrome = isPlaindrome(num);
        if(palindrome){
            System.out.println("Palindrome is a number");
        }else {
            System.out.println("Not a Palindrome number");
        }
    }

    public static boolean isPlaindrome(int number) {
        int originalNumber = number;
        int newNumber = 0;
        while (number > 0) {
            int remainderNumber = number % 10;
            newNumber = newNumber * 10 + remainderNumber;
            number /= 10;

        }
        if (originalNumber == newNumber) {
            return true;
        }
        return false;

    }
}
