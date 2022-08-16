package day03_Scanner;

import java.util.Scanner;

public class c06_Scanner {
    public static void main(String[] args) {

Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        String isim=scan.nextLine();
        System.out.println("lutfen soyisminizi giriniz");
        String soyisim= scan.nextLine();
        System.out.println("lutfen yasinizi giriniz");
        double yas=scan.nextDouble();

        System.out.println("girilen bilgiler="+isim+","+soyisim+","+yas);



    }
    }


