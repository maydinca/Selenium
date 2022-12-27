package RecapJava;

public class _002_stringSiniflari {
    public static void main(String[] args) {


    String s1="Mehmet";
    String s2=new String("Mehmet");    // ikisinin farki bellekte godeterildigi yer farkli


        System.out.println("S2 nin uzunlugu"+s2.length());  // s2 nin uzunlugunu gosterir

        System.out.println("0. index :"+s2.charAt(0)); //0. index de ki harfi getirir
        System.out.println("Son harf :"+s2.charAt(s2.length() - 1)); // Son harfi getirir

        System.out.println("-------");

        System.out.println(s2.startsWith("Meh")); // Meh ile basliyorsa true doner (Boolean ifade)
        System.out.println(s2.endsWith("et")); // et ile bitiyorsa true doner (Boolean ifade)


    }
}