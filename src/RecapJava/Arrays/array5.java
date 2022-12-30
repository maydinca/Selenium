package reviewTasks;

import java.util.Arrays;

/*
Task6:
        Given a String array as ["bird", "dog", "cat", "door"]
        Create a new array named as arrRev.
        Reverse the order of the elements of the String array and store in the arrRev.
        Print the arrRev
        Sample:
        Given ["bird", "dog", "cat", "door"] -> prints ["door", "cat", "dog" , "bird"]
 */
public class array5 {
    public static void main(String[] args) {
        String[] arr={"bird", "dog", "cat", "door"};
        String[] arrRev=new String[4];

        for (int i = 0; i < arr.length; i++) {
            arrRev[i]=arr[arrRev.length-1-i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrRev));
    }
}
