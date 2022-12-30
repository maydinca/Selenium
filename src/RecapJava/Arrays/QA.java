package RecapJava.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class QA {
    public static void main(String[] args) {

        int[] arr={6,5,2,7,9,1,3,8,6,2,1,3,7,9,9};


        ArrayList<Integer>arrayList =new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {
            arrayList.add(arr[i]);
        }System.out.println("arrayList = " + arrayList);

        Collections.sort(arrayList);
        System.out.println("Sorted List :"+arrayList);
        Collections.sort(arrayList, Collections.reverseOrder());
        System.out.println("Sorted List 2 :"+arrayList);

        // create a stream from arraylist
        Stream<Integer> stream = arrayList.stream();

        // call the distinct() of Stream
        // to remove duplicate elements
        stream = stream.distinct();

        // convert the stream to arraylist
        arrayList = (ArrayList<Integer>)stream.collect(Collectors.toList());
        System.out.println("ArrayList without duplicate elements: " + arrayList);
        Collections.sort(arrayList);
        System.out.println("Sorted List 3 tekrarsiz :"+arrayList);
        }
    }

