package day03_Scanner;

import java.util.Scanner;

public class c05_Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);


        System.out.println("lutfen iki sayi giriniz");
        double sayi1=scan.nextDouble();
        System.out.println("lutfen ikinci sayiyi giriniz");
        double sayi2=scan.nextDouble();
        System.out.println("girilen sayilari carpimi :"+ sayi1*sayi2);



    }


}
