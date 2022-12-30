package reviewTasks;

import java.util.Arrays;

/*
Homework:
    String[][] arr = {{"apple", "watermelon", "grapes"},
                      {"math", "geometry", "chemistry","science","algebra"},
                      {"london", "istanbul", "washington", "mexico"}};
    Return all string in the camel case format.
    example: apple => Apple, math => Math, london => London
 */
public class arrayCamelCase {
    public static void main(String[] args) {
        String[][] arr = {{"apple", "watermelon", "grapes"},
                {"math", "geometry", "chemiSTry","science","algebra"},
                {"london", "istanbul", "washington", "mexico"}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                char firstLetters = arr[i][j].toUpperCase().charAt(0);
                arr[i][j]=firstLetters+arr[i][j].toLowerCase().substring(1);
            }
        }
        System.out.println("arr = " + Arrays.deepToString(arr));

    }
}
