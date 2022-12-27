package RecapJava;

import java.util.ArrayList;

public class _00_arrayList {
    public static void main(String[] args) {

        ArrayList<Integer> yaslar = new ArrayList<>();
        
        yaslar.add(2);
        yaslar.add(38);
        yaslar.add(35);


        System.out.println("yaslar = " + yaslar);

        System.out.println("0 . index = " + yaslar.get(0));
        System.out.println("kac elamni var? "+yaslar.size());


        System.out.println("============");

        for (int i = 0; i < yaslar.size(); i++) {
            System.out.println(i+1+" eleman :"+yaslar.get(i));

        }
    }
}
