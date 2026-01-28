package functions;

import java.util.*;

public class PrimeNumber {
    public static void main(String args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter for Checking  that is Prime or not");
        int number = sc.nextInt();
        boolean prime = isPrime(number);
        if(prime){
            System.out.println(number+"is a Prime Number");
        }else{
            System.out.println( number + "not a Prime Number");
        }
    }

    public static Boolean isPrime(int number) {
        int i = 2;
        while (i < number) {
            if (number % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}