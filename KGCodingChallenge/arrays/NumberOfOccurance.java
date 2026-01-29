package arrays;

import java.util.Scanner;

public class NumberOfOccurance {
    public static void main(String args[]){
        int[] array = ArrayUtility.arrays();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number which you want to  finf the occurane : ");
        int num = sc.nextInt();

        int reult = numberOfOccuranceCount(array, num);
        System.out.println("The number of occurance of the number is : "+ reult);


    }
    public static int numberOfOccuranceCount(int[] num1, int num2){
        int i = 0;
        for(int j : num1){
            if(j == num2){
                i++;
            }
        }
        return i;

    }

}