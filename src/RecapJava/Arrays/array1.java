package reviewTasks;

import java.util.Arrays;

/*
Task2:
        Given a string as "Peach Berry Orange WaterMelon Orange"
        1. Convert this string to String[]. Example: [Peach, Berry, Orange, WaterMelon, Orange]
        2. Write below logic:
            2.a If this string array contains "Orange" change all "Orange" to "Apple"
        3. Print the Array
        Example: Given [Peach, Berry, Orange, WaterMelon, Orange] -> prints [Peach, Berry, Apple, WaterMelon, Apple]
 */
public class array1 {
    public static void main(String[] args) {
        String str="Peach Berry Orange WaterMelon Orange";
        String[] strArr = str.split(" ");
        System.out.println(Arrays.toString(strArr));

        for (int i = 0; i < strArr.length; i++) {
            if(strArr[i].equals("Orange")){
                strArr[i]="Apple";
            }
        }

        System.out.println(Arrays.toString(strArr));

//        for (String fruit : strArr) {
//            if(fruit.equals("Orange")){
//                fruit="Apple";
//            }
//        }

//        ArrayList<String> strArrList=new ArrayList<>();
//        for (int i = 0; i < strArr.length; i++) {
//            strArrList.add(strArr[i]);
//        }
//        System.out.println("strArrList.toString() = " + strArrList);
//
//
//        for (int i = 0; i < strArrList.size(); i++) {
//            if(strArrList.get(i).equals("Orange")){
//                System.out.println(i);
//                strArrList.set(i,"Apple");
//            }
//        }
//
//        System.out.println("strArrList.toString() = " + strArrList);
    }
}
