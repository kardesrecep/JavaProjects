package day11_StrinManipulations;

import java.util.Scanner;

public class C03_Contains {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen email giriniz");
        String email = scan.nextLine();
        if (!email.contains("@gmail.com")) {
            System.out.println("lutfen gmail giriniz");

        } else if (email.lastIndexOf("@gmail.com") == (email.length() - 10)) {
            System.out.println("email adresiniz kabul edildi");

        } else {
            System.out.println("lutfen yazimi kontrol et");
        }
    }
}
