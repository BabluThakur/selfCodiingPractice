package functions;

import java.util.Scanner;

public class ReverseDigit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = sc.nextInt();
        int reverseNumber = reverse(number);
        System.out.println(reverseNumber);
    }

    public static int reverse(int number) {
        int reverseNumber = 0;

        while (number != 0) {
            int rem = number % 10;
            reverseNumber = reverseNumber * 10 + rem;
            number /= 10;
        }
        return reverseNumber;
    }
}

