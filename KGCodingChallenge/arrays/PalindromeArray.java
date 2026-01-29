package arrays;

public class PalindromeArray {
    public static void main(String args[]){
        int[] array = ArrayUtility.arrays();
        boolean Palindrome = isPalindrome(array);
        if(Palindrome){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }

    public static boolean isPalindrome(int[] array){
        int i = 0;
        int j = array.length -1;
        while(i < (array.length -1 ) / 2){
            if(array[i] != array[j]){
                return false;
            }
            i++;
            j--;

        }
        return true;
    }
}
