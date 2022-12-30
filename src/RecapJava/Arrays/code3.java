package RecapJava.Arrays;

public class code3 {
    public static void main(String[] args) {
        int[] int_array = new int[31];

        for (int i=0; i<30; i++) {
            int_array[i] = i + 1;
        }

        System.out.println(int_array[30]);
    }
}
