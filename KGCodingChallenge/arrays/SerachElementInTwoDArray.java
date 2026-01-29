package arrays;

import java.util.Scanner;

public class SerachElementInTwoDArray {
    public static void main(String args[]){
        int[][] TwodArrays = TwoDArrayUtility.newArray();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number which you want to search for : ");
        int number = sc.nextInt();
        boolean isPresent = isElementPresent(TwodArrays, number);
        if(isPresent){
            System.out.println("Element is present in the array");
        }else {
            System.out.println("Element is not present in the array");
        }

    }

    public static boolean isElementPresent(int[][] twoDArray, int number){
        for(int i = 0; i<twoDArray.length; i++){
            for(int j = 0; j< twoDArray[i].length; j++){
                if(twoDArray[i][j] == number){
                    return true;
                }
            }
        }
        return false;
    }
}
