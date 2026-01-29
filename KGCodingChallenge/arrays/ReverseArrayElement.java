
package arrays;

import java.util.Arrays;

public class ReverseArrayElement {
    public static void main(String args[]) {
        int[] array = ArrayUtility.arrays();
        int[] newArray = reverseArray(array);
        System.out.println(Arrays.toString(newArray));
    }

    public static int[] reverseArray(int[] array) {
        int i = 0;
        int j = array.length - 1;

        while (i < (array.length - 1) / 2) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
        return array;
    }
}