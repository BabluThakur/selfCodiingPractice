

package arrays;

import java.util.Arrays;

public class CheckArrayIsSorted {
    public static void main(String args[]) {
        int[] array = ArrayUtility.arrays();
        boolean isAccsending = accsending(array);
        boolean isDescending = descending(array);

        if (isAccsending || isDescending) {
            System.out.println("The Given Array is Sorted ");
        } else {
            System.out.println("The Given Array is not sorted ");
        }

    }

    public static Boolean accsending(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {

                return false;

            }
        }
        return true;

    }

    public static Boolean descending(int[] array) {
        for (int i = 0; i < array.length -1; i++) {
            if (array[i] < array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
