package reviewTasks;

import java.util.ArrayList;
import java.util.Arrays;

/* Task 3
         Create a method which will take two lists as parameter and return a new list with all values of the first list
          that are not in the second list.
         Return ArrayList
         Example:
         Input:
         [1, 2, 3, 4] and [1, 4, 5, 9]
         Output:
         [2, 3] */
public class ArrayDoesNotContain {
    public static void main(String[] args) {
        ArrayList<Integer> array1=new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> array2=new ArrayList<>(Arrays.asList(1, 4, 5, 9));

        farkList(array1,array2);
        farkList2(array1,array2);

    }

    public static ArrayList<Integer> farkList(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        ArrayList<Integer> result = new ArrayList<>(arr1);
        for (int i = 0; i < arr1.size(); i++) {
            for (int j = 0; j < arr2.size(); j++) {
                if(arr1.get(i).equals(arr2.get(j))){
                    result.remove(arr1.get(i));
                }
            }
        }
        System.out.println("result = " + result);
        return result;
    }

    public static ArrayList<Integer> farkList2(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        ArrayList<Integer> result = new ArrayList<>();
        arr1.removeAll(arr2);
        result=arr1;
        System.out.println("result = " + result);
        return result;
    }


}
