
package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DeletingSpecificElement {
    public static void main(String args[]) {
        int[] array = ArrayUtility.arrays();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number which you want to delete from the Array ");
        int num = sc.nextInt();

        int[] removedElement = newArray(array, num);


        System.out.println(Arrays.toString(removedElement));
    }

    public static int[] newArray(int[] array, int num) {

        int occurrence = numberOfOccureence(array, num);

        if (occurrence == 0) {
            return array;
        }

        int[] newArray = new int[array.length - occurrence];

        int i = 0, j = 0;

        while (i < array.length) {
            if (array[i] != num) {
                newArray[j] = array[i];
                j++;
            }

            i++;
        }
        return newArray;

    }

    public static int numberOfOccureence(int[] array, int num) {
        int count = 0;

        for (int i : array) {
            if (i == num) {
                count++;
            }

        }
        return count;
    }
}
