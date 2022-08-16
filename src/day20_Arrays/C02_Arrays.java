package day20_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        int sayilar []=new int[3];
        System.out.println(sayilar); // [I@58ceff1
        // non-primitive data turundeki datalari
        // her zaman direk yazdiramayabiliriz
        // Array'i yazdirmak istersek Arrays class'indan yardim isteriz
        System.out.println(Arrays.toString(sayilar)); // [0, 0, 0]
        sayilar[2]=10;
        sayilar[0]=5;
        sayilar[1]=3;
        System.out.println(sayilar); // [I@58ceff1
        System.out.println(Arrays.toString(sayilar)); // [5, 3, 10]
        String sinifList[]={"Ali","Ayse","Ahmet"};
        System.out.println(Arrays.toString(sinifList)); // [Ali, Ayse, Ahmet]
        sinifList[1]="Hasan";
        System.out.println(Arrays.toString(sinifList)); // [Ali, Hasan, Ahmet]
        System.out.println(sinifList[1]); // hasan'i yazdiralim
        System.out.println(sinifList[0]);// Ali
        System.out.println(sinifList[2]);
    }
}