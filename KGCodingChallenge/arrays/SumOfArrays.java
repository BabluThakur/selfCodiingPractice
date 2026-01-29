package arrays;

public class SumOfArrays {
    public static void main(String args[]) {
        int[] array = ArrayUtility.arrays();
        int result = sumOfArray(array);
        System.out.println("The Sum of the Arrays is "+ result);

    }

    public static int sumOfArray(int[] num){
        int sum = 0;
        for (int i : num) {
            sum += i;
        }
        return sum;
    }
}
