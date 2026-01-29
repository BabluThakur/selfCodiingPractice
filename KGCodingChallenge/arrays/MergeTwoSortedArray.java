
package arrays;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String args[]) {
        int[] array1 = ArrayUtility.arrays();
        int[] array2 = ArrayUtility.arrays();

        int[] newArray = mergeTwoArray(array1, array2);
        System.out.println(Arrays.toString(newArray));
    }

    public static int[] mergeTwoArray(int[] array, int[] array1) {
        int[] firstSortedArray = sortedArray(array);
        int[] secondSortedArray = sortedArray(array1);
        int size1 = firstSortedArray.length;
        int size2 = secondSortedArray.length;
        int newArraySize = size1 + size2;
        int[] newArray = new int[newArraySize];
        int i = 0;

        for (int j : firstSortedArray) {
            newArray[i] = j;
            i++;

        }
        int z = 0;
        for (int k = size1; k < newArraySize; k++) {
            newArray[k] = secondSortedArray[z];
            z++;
        }

        int[] finalArray = sortedArray(newArray);


        return newArray;
    }

    public static int[] sortedArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}