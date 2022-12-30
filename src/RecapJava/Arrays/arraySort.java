package reviewTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.IntStream;

/*
Task9.
        Given an array of [6,5,2,7,9,1,3,8,6,2,1,3,7,9,9]
        1. Sort an array. output should be [1, 1, 2, 2, 3, 3, 5, 6, 6, 7, 7, 8, 9, 9, 9]
        2. Remove all duplicates from the array and print.
        output should be [1, 2, 3, 4, 5, 6, 7, 8, 9]
 */
public class arraySort {
    public static void main(String[] args) {

        int[] arr={6,5,2,7,9,1,3,8,6,2,1,3,7,9,9};
        System.out.println("arr = " + Arrays.toString(arr));

        int temp;
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println("arr = " + Arrays.toString(arr));


        ArrayList<Integer> arrList=new ArrayList<>();
        System.out.println("arrList = " + arrList);

        for (int i = 0; i < arr.length; i++) {
            arrList.add(i,arr[i]);
        }
        System.out.println("arrList = " + arrList);
        System.out.println("===================================");

        for (int i = arrList.size()-1; i >0 ; i--) {
            if(arrList.get(i).equals(arrList.get(i-1))){
                arrList.remove(i);
            }
        }
        System.out.println("arrList = " + arrList);
        }
    }

