package functions;
import java.util.*;
public class GcdExample {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int number1 = sc.nextInt();
        System.out.println("Enter second Number");
        int number2 = sc.nextInt();

        int result = gcd(number1, number2);
        System.out.println(result);

    }

    public static int gcd(int num1, int num2){
        int min = minNumber(num1, num2);

        int greatetCommonDivsior = 1;

        int i= 2;
        while(i <= min){
            if(num1 %i == 0 && num2 % i ==0){
                greatetCommonDivsior = i;

            }
            i++;
        }
        return greatetCommonDivsior;
    }

    public static int minNumber(int num1,int num2){
        if(num1>num2 ) return num1;
        else return num2;
    }
}
