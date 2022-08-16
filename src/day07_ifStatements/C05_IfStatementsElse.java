package day07_ifStatements;

import java.util.Scanner;

public class C05_IfStatementsElse {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir karakter giriniz");
        char harf=scan.next().charAt(0);
        if ((harf>='a' && harf>= 'z')||(harf>='A' && harf>= 'Z')) {
            System.out.println("girilen karakter bir harf");
        }else {
            System.out.println("girilen karakter bir harf degil");
        }
       // Soru 3) Kullaniciya yasini sorun, eger yas 65’den kucuk ise
        // “emekli olamazsin, calismalisin”, 65’e esit veya buyukse “
        // Emekli olabilirsin” yazdirin
//



    }
}

