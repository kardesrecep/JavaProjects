package day03_Scanner;

import java.util.Scanner;

public class c04_Scanner {
    public static void main(String[] args) {
        //kullanicidan ismini isteyin
        //giirilen ismi
        // isminiz ismail seklinde yazin.
        //insanlarin dunyasindan kodlarimizin bulundugu classa deger almak icin kullaniriz.

        Scanner scan =new Scanner(System.in);

        System.out.println("Lutfen isminizi girin");
        String kullaniciismi=scan.next();

        System.out.println("isminiz:"+kullaniciismi);




    }
}
