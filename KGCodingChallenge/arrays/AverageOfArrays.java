package arrays;

public class AverageOfArrays {
    public static void main(String args[]){
        int[] array = ArrayUtility.arrays();
        int result = averageOfArray(array);
        System.out.println("The Sum of the Arrays is "+ result);

    }

    public static int averageOfArray(int[] array){
        int sum = 0;
        for(int i : array){
            sum += i;
        }
        return sum/array.length;
    }
}
