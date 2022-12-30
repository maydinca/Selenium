package reviewTasks;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

/*
Task4:
        1. Create one int array with length of 10.
        2. Using Random class, generate random numbers between 0 and 20
        and fill all indexes of an array.
        3. Print the difference between the largest and smallest values in the array. (largest - smallest = difference)
        [10, 3, 5, 6, 8, 7, 5, 6, 8, 7] → 7 (observe 10-3 = 7)
 */
public class array3 {
    public static void main(String[] args) {
        int [] a = new int[10];

        Random rnd=new Random();

        for (int i = 0; i <10 ; i++) {
            int n= rnd.nextInt(50);
            a[i]=n;

        }
        System.out.println("A nin elemanlari"+Arrays.toString(a));

        int max=a[0];
        int min=a[0];
        for (int i = 1; i < a.length; i++) {
            if(a[i]>max){
                max=a[i];
            }
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println("max: "+max);
        System.out.println("min: "+min);
        System.out.println("Difference= "+(max-min));


    }
}
