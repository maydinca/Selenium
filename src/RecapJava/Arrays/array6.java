package reviewTasks;

import java.util.Arrays;

/*
    Task8:
        Given a String as "$15.2  156.00 €25.4 £16.4 654.9 ₺54.1 $105.2 €55.8 £23.7 ₺1658.10 $236.2 €30 35.43 £18.54 ₺754.132"
        if a price starts with $, multiply with 3.5
        if a price starts with €, multiply with 4.2
        if a price starts with £, multiple with 6.7
        if a price starts with ₺, multiply with 1.8
        if a price doesnt start with any currency, return it`s own value.
        1. Get total of each currency`s prices.
        2. Get total of all prices.
 */
public class array6 {
    public static void main(String[] args) {
        String str="$15.2 156.00 €25.4 £16.4 654.9 ₺54.1 $105.2 €55.8 £23.7 ₺1658.10 $236.2 €30 35.43 £18.54 ₺754.132";
        String[] liste = str.split(" ");
        System.out.println("liste = " + Arrays.toString(liste));

        double dolarSum=0;
        double euroSum=0;
        double poundSum=0;
        double tlSum=0;
        double onlySum=0;

        for (int i = 0; i < liste.length; i++) {
            if(liste[i].startsWith("$")){
               dolarSum+=Double.parseDouble(liste[i].replace(liste[i].charAt(0), ' '))*3.5;
            }
             else if(liste[i].startsWith("€")){
                euroSum+=Double.parseDouble(liste[i].replace(liste[i].charAt(0), ' '))*4.2;
            }
            else if(liste[i].startsWith("£")){
                poundSum+=Double.parseDouble(liste[i].replace(liste[i].charAt(0), ' '))*6.7;
            }
            else if(liste[i].startsWith("₺")){
                tlSum+=Double.parseDouble(liste[i].replace(liste[i].charAt(0), ' '))*1.8;
            }
            else {
                onlySum+=Double.parseDouble(liste[i])*1.0;
            }
        }
        System.out.println("dolar: "+dolarSum);
        System.out.println("euro: "+euroSum);
        System.out.println("tl: "+tlSum);
        System.out.println("sterlin: "+poundSum);
        System.out.println("onlysum: "+onlySum);
        System.out.println("Total: "+(dolarSum+euroSum+tlSum+poundSum+onlySum));

        //System.out.println((15.2+105.2+236.2)*3.5);

    }
}
