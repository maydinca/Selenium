package C011_utils;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("Input");
        String value =scanner.next();
        System.out.println("Input Entered: " + value);
        scanner.close(); // we need to close scanner because memory arising itself because of memory leak
        // it is recommended to close the scanner everytime tou are done utilizing it.
    }
}
