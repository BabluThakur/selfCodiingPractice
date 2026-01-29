package arrays;

public class SumOfTwoDiagonalOfTwoDArray {
    public static void main(String args[]) {
        int[][] array = TwoDArrayUtility.newArray();
        int result = sumOfDiagonal(array);
        System.out.println("The sum of the Two Diagonal is  : "+result);
    }

    public static int sumOfDiagonal(int[][] array) {

        int sumofLeftDiagonal = leftDiagonal(array);
        int sumofRightDiagonal = rightDiagonal(array);

        int result = sumofLeftDiagonal + sumofRightDiagonal;
        if (array.length % 2 != 0) {
            int ind = array.length / 2;
            result -= array[ind][ind];
        }
        return result;
    }

    public static int leftDiagonal(int[][] array) {
        int sum = 0;
        int i = 0;
        while (i < array.length) {
            sum += array[i][i];
            i++;

        }
        return sum;
    }

    public static int rightDiagonal(int[][] array){
        int sum = 0;
        int i = 0;
        while(i<array.length){
            int col = array.length -1 -i;
            sum += array[i][col];
            i++;
        }
        return sum;
    }
}
