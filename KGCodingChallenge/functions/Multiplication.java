package functions;
import java.util.*;

public class Multiplication {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which you want to print the table");
        int number = sc.nextInt();
        table(number);

    }
    public static void  table(int number){
        for(int i = 1; i <= 10; i++){
            System.out.println(i +"*"+ number + "=" + i * number);
        }
    }
}
