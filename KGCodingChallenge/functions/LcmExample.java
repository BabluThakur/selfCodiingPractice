package functions;

import com.sun.security.jgss.GSSUtil;

import java.util.*;

public class LcmExample {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number :");
        int firstNumber = sc.nextInt();
        System.out.print("Enter second number : ");
        int secondNumber = sc.nextInt();
        int result = lcm(firstNumber, secondNumber);
        System.out.println(result);
    }

    public static int lcm(int num1, int num2) {

        int i = 1;

        while (true) {

            int fact = num1 * i;
            if (fact % num2 == 0) {
                return fact;

            }
            i++;
        }

    }
}
