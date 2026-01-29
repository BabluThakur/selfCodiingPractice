package arrays;

public class MaxAndMinArray {
    public static void main(String arhs[]) {
        int[] array = ArrayUtility.arrays();
        int max = maximum(array);
        int min = minmum(array);
        System.out.println("The maximum number is "+ max);
        System.out.println("The minimum number is "+ min);
    }

    public static int maximum(int[] array) {
        int max = array[0];
        int i = 0;
        while (i < array.length) {
            for (int j : array) {
                if (max < j) {
                    max = j;
                }
            }
            i++;
        }
        return max;
    }

    public static int minmum(int[] array) {
        int min = array[0];
        int i = 0;
        while (i < array.length) {
            for (int j : array) {
                if (min > j) {
                    min = j;
                }
            }
            return min;
        }
    return min;
    }
}
