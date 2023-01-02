package RecapJava.Arrays;

import java.util.Arrays;

public class D_arrayList_int {
    public static void main(String[] args) {


        int[][] arr = new int[2][3];

        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;

        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;

        System.out.println("arr nin elamanlari" + Arrays.toString(arr));
        System.out.println("arr nin elamanlari" + arr);

        System.out.println("arr nin elamanlari" + Arrays.deepToString(arr));

        // arrays.deeptostring kullanmadan arr nin birinci elamaninin uzunlugunu nasil gosterebilirim?

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("arr nin " +i+ ". elemani "+j+". elemani ' :" + arr[i][j]);


            }

        }
        System.out.println("*******************");

        String [][][] ogrenciler=new String[1][3][3];  //array declaration
        ogrenciler[0][0][0]="Mehmet";
        ogrenciler[0][0][1]="Elisa";
        ogrenciler[0][0][2]="Aydin";

        ogrenciler[0][1][0]="hatice";
        ogrenciler[0][1][1]="Ferah";
        ogrenciler[0][1][2]="Esra";

        ogrenciler[0][2][0]="nuri";
        ogrenciler[0][2][1]="recep";
        ogrenciler[0][2][2]="huseyin";

        for (int i = 0; i < ogrenciler.length; i++) {            //represents block

            for (int j = 0; j <ogrenciler[i].length ; j++) {     //represents rows

                for (int k = 0; k < ogrenciler[i][j].length; k++) { //represents columns
                    System.out.println(Arrays.deepToString(ogrenciler));

//                    System.out.println(ogrenciler[i][j][k]);
//                    System.out.println(Arrays.deepToString(ogrenciler));

//                    System.out.println("*********");
//                    System.out.println ("ogrenciler [" + i+ "][" + j + "][" + k + "] = " + Arrays.deepToString(ogrenciler));
                }
            }
//            System.out.println(i+" . elamanin "+ " ninci indexinin"+Arrays.deepToString(ogrenciler));
        }



//çok boyutlu dizimizi oluşturduk.
        int dizi[][] = { {16,21,33},{67,90,11},{39,10,98},{18,76,87}};

        //for döngüleri ile satır ve sütunlara elemanları yazmasını sağladık.
        for (int i=0; i< 4 ; i++)
        {
            for (int j=0; j < 3 ; j++)
                System.out.print(dizi[i][j] + " ");

            System.out.println();
        }
    }
}
