package functions;

import java.util.Scanner;

public class SumOfDigitNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
    int result = sumOfDigitNumber(number);
        System.out.println("Sum of the digit number is "+ result);
    }



    static int sumOfDigitNumber(int number) {
        int sum = 0;
        while (number != 0) {
            int mod = number % 10;
            sum +=mod;
            number /=10;
        }
        return sum;
    }
}
