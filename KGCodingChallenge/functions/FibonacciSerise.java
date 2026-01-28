
package functions;

import java.util.Scanner;

public class FibonacciSerise {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = sc.nextInt();

        fibonacci(number);

    }

    public static void fibonacci(int number) {
        if (number < 0) {
            return;
        }
        System.out.print(0);

        if (number == 0) {
            return;
        }

        System.out.print(" "+1);

        int i = 0, j = 1;
        while (i + j <= number) {
            int sum = i + j;
            System.out.print(" " + sum);
            i = j;
            j = sum;
        }


    }
}
