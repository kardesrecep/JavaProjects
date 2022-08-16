package day09_ternaryOperator;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        double sayi=scan.nextDouble();

        if (sayi>0) {
            System.out.println(sayi);
        } else{
            System.out.println("lutfen sayi gir");
            double sayi2= scan.nextDouble();
            System.out.println(sayi*sayi2);

        }






    }










}
