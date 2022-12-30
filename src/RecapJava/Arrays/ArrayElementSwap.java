package reviewTasks;

import java.util.ArrayList;
import java.util.Scanner;

/*Task 2.

        1. Using Scanner class, and using conditional loop, ask user to provide any int numbers and add to the ArrayList<Integer>.
When user enters number less than 0, don`t add to the ArrayList and print the result.
        Example: [1, 5, 10, 25, 30]
        2. Ask User to provide two indexes between 0 and the last index of the ArrayList.
If user provides number between 0 and the last index, switch values in the ArrayList and print the result.
Example: user provided indexed 1 and 3 => output should be [1, 25, 10, 5, 30] ==> since index 1 was 5, index 3 was 25

If user provides indexes out of range, switch first and last objects of ArrayList.
Example: user provided indexed 0 and 10 => output should be [1, 5, 10, 25, 30] ==> since index 10 is out of the index range

 */
public class ArrayElementSwap {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Array List icin Rakam gir");

        ArrayList<Integer> arrayList=new ArrayList<>();
        int num= scan.nextInt();
        while (num>0) {
            arrayList.add(num);
            num= scan.nextInt();
        }
        System.out.println("arrayList = " + arrayList);

        System.out.println("**************************");

        System.out.println("degistirmek istedigin sayilarin index degerlerini gir");
        int rakam1=scan.nextInt();
        int rakam2=scan.nextInt();

        int temp=arrayList.get(rakam2);
        arrayList.set(rakam2,arrayList.get(rakam1));
        arrayList.set(rakam1,temp);

        System.out.println("arrayList = " + arrayList);

    }

}
