package functions;
import java.util.*;

public class FactorialExample {
    public static void main(String rags[]){
        Scanner  sc = new Scanner(System.in);
        System.out.print("Enter a number to find the factorial of that number");
        int number = sc.nextInt();
        int result = factorial(number );
        System.out.println( result);

    }

    public static int  factorial(int number ){
        int fact =1;
        for(int i = 1; i <= number; i++){
            fact *= i;
        }
        return fact;
    }
}
