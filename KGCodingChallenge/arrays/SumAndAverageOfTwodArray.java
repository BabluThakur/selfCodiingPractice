package arrays;

public class SumAndAverageOfTwodArray {
    public static void main(String args[]) {
        int[][] twoDArray = TwoDArrayUtility.newArray();

        int sumOfArray = sum(twoDArray);
        float averageOfArray = average(twoDArray);

        System.out.println("The sum of the two D array is: " + sumOfArray);
        System.out.println("The average of the two D array is: " + averageOfArray);
    }

    public static int sum(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }

    public static float average(int[][] array) {
        int sumOfElement = sum(array);


        int numberOfElementInArray = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                numberOfElementInArray++;
            }
        }

        float aveg = sumOfElement / numberOfElementInArray;
        return aveg;
    }

}