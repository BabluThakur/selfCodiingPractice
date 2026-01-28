package functions;
import java.util.*;
public class SumOfOddNumber {
    public static void main(String  args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to sum the odds number");
        int number = sc.nextInt();
       int result = sumOfOddNumber(number);
        System.out.println("Sum of the odd Number is "+ result);
    }

    public static int  sumOfOddNumber(int number){
        int sum = 0;
        if(number < 0){
            return 0;
        }  else if(number == 0){
            return 0;
        }
        for(int i =1; i<=number; i++){

          if(i % 2 != 0){
                 sum +=i;
            }
        }
        return sum;
    }


}


