package day06_concatenation;

import java.util.Scanner;

public class C01_WrapperClasses {
    public static void main(String[] args) {
        String str= "Askim seni cok seviyorum icom";
        System.out.println(str.toUpperCase());

        boolean guzelMi=true;

        String telNO= "2365054";

        //kullanicadan bie sifre isteyin eger sifre sadece rakamlardan olusuyorsa kabul etmeyin//
        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen 5 basamakli bir sifre giriniz");

        String sifre=scan.nextLine();
        Integer sifreSayi=Integer.parseInt(sifre);
        System.out.println("girilen sifre : " + sifre);
        System.out.println("Integer sifre:" + sifreSayi);



    }
}
