package RecapJava;

import java.util.ArrayList;

public class _001_ForEach {
    public static void main(String[] args) {
        ArrayList<Integer> yaslar = new ArrayList<>();

        yaslar.add(2);
        yaslar.add(38);
        yaslar.add(35);

       System.out.println("yaslar = " + yaslar);

        for (Integer yas : yaslar) {
            System.out.println("heryas = " + yas);

            System.out.println(" ==============");




        }
    }
}
