
package functions;

import java.util.Scanner;

public class AramStrongNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();

        boolean arsamString = isAramStrongNumber(number);
        if (arsamString) {
            System.out.println("number is aramstring");
        } else {
            System.out.println("number is not aramstring");
        }
    }

    public static boolean isAramStrongNumber(int number) {
        int copyNumber = number;
        int digits = numberOfDigitsInNumber(number);

        int arm = 0;
        while (number != 0) {
            int rem = number % 10;
            arm += pow(rem, digits);
            number /= 10;
        }
        if (copyNumber == arm) {
            return true;
        }
        return false;

    }

    public static int pow(int number1, int number2) {
        int i = 1;
        int result = 1;

        while (i <= number2) {
            result *= number1;
            i++;
        }
        return result;
    }

    public static int numberOfDigitsInNumber(int number) {
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;


        }
        return count;

    }
}

