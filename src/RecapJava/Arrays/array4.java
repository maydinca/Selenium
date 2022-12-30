package reviewTasks;

import java.util.Arrays;
import java.util.Random;
/*
Task5:
        Create a char array
        The array has a random length between 2 and 22 (inclusive)
        The array should only have random capital letters.
        Print the array.
 */
public class array4 {
    public static void main(String[] args) {
        Random random=new Random();
        char[] arr = new char[random.nextInt(2,22)];

        for (int i = 0; i < arr.length; i++) {
            char n= (char) (random.nextInt(65,90));
            arr[i]=n;
        }
        System.out.println(Arrays.toString(arr));
    }
}
