package reviewTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/*
Task3:
        1. Create two int arrays. Name them as arrOuter and arrInner.
            1.a arrOuter is length of 4.
            1.b arrInner is length of 2.
        2. Using Random class, generate random numbers between 0 and 10
        and fill all indexes of both arrays.

       3. Print true if they have the same first element, or they have the same last element.
        Samples:
        [1, 2, 4, 6], [2, 6] → true
        [1, 2, 4, 6], [2, 3, 4] → false
        [1, 2, 4, 4, 6], [1, 4] → true
 */
public class array2 {
    public static void main(String[] args) {
//        int [] a=new int[4];
//        int [] b=new int[2];
//        Random random=new Random();
//
//        for (int i = 0; i <4 ; i++) {
//            int n= random.nextInt(10);
//            a[i]=n;
//        }
//        System.out.println("a = " + Arrays.toString(a));
//
//        int n= random.nextInt(10);
//        b[0]=n;
//        int m= random.nextInt(10);
//        b[1]=m;
//
//        System.out.println("a = " + Arrays.toString(b));

        Random random=new Random();
        int[] a={random.nextInt(10),random.nextInt(10),random.nextInt(10),random.nextInt(10)};
        int[] b={random.nextInt(10),random.nextInt(10)};
        System.out.println("a = " + Arrays.toString(a));
        System.out.println("a = " + Arrays.toString(b));

        if(a[0]==b[0] ||a[a.length-1]==b[b.length-1]){
            System.out.println("True");
        }else System.out.println("False");


    }

}
