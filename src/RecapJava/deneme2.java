package RecapJava;

/**
 *
 * What is the output of this code?
 * int result = 0;
 * for (int i = 0; i < 5; i++) {
 *   if (i == 3) {
 *      result += 10;
 *    } else {
 *      result += i;
 *    }
 * }
 * System.out.println(result);

public class deneme2 {
    + 31
    int result = 0;
for (int i = 0; i < 5; i++) {
        if (i == 3) {
            result += 10;
        } else {
            result += i;
        }
    }
System.out.println(result);

// Values of i ranges from 0 to 4 for each loop.

    When i = 0, i == 3 is false, result += i, result = 0.
    When i = 1, i == 3 is false, result += i, result = 1.
    When i = 2, i == 3 is false, result += i, result = 3.
    When i = 3, i == 3 is true, result += 10, result = 13.
    When i = 4, i == 3 is false, result += i, result = 17.
}
 */