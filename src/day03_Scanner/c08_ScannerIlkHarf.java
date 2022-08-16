package day03_Scanner;

import java.util.Scanner;

public class c08_ScannerIlkHarf {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
char ilkharf=scan.next().toUpperCase().charAt(0);
        System.out.println();

    }
}
