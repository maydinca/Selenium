package reviewTasks;

import java.util.Arrays;
import java.util.Random;

/*
Mentoring Homework with 2D Arrays:
    /*Write a Java program to print an array after changing the rows and columns of a given two-dimensional array.
1)    2D Array should have random length btw 3 – 6 for both rows and columns
2)    Added elements should be generated randomly btw 0 – 100 in tens format 10, 20, 30, …

Original Array Example:
{{10 20 30},
{40 50 60}}
After changing the rows and columns of the above array:
{{10 40},
{20 50},
{30 60}}
*/
public class _2DArrayColumnRowChange {
    public static void main(String[] args) {
        Random random=new Random();

        int a=random.nextInt(3,6);
        int b=random.nextInt(3,6);
        int[][] arr=new int[a][b];
        System.out.println("Arrays.deepToString(arr) = " + Arrays.deepToString(arr));

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]= (random.nextInt(0,100)/10)*10;
            }
        }
        System.out.println("Arrays.deepToString(arr) = " + Arrays.deepToString(arr));

        int[][] newArr=new int[b][a];
        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr[i].length; j++) {
                newArr[i][j]=arr[j][i];
            }
        }
        System.out.println("Arrays.deepToString(newArr) = " + Arrays.deepToString(newArr));

    }
}
