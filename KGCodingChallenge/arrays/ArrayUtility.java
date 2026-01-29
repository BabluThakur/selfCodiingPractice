
package arrays;

import java.util.*;

public class ArrayUtility {

    public static int[] arrays() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter size of the Arrays");
        int size = sc.nextInt();

        int[] array = new int[size];

        int i = 0;
        while (i < size) {
            System.out.print("Enter the " + i + " element of the  Array ");
            array[i] = sc.nextInt();
            i++;
        }

        return array;

    }
}

