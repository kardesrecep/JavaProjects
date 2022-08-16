package day09_ternaryOperator;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        double sayi=scan.nextDouble();

        System.out.println(sayi>=0 ? sayi: (-1*sayi));

// Soru3 ) Kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin

        System.out.println("lütfen bir sayi giriniz");
        double sayi1=scan.nextDouble();
        System.out.println("Girdiginiz sayinin mutlak degeri : "+ (sayi>=0 ? sayi : (-1 * sayi)));
    }
}




