package day08_IfStatements;

import java.util.Scanner;

public class C02_IfElseIfStatements {
    public static void main(String[] args) {


        /*Soru 7) Kullanicidan 100 uzerinden notunu isteyin.
        Not’u harf sistemine cevirip yazdirin. 50’den kucukse
        “D”, 50-60 arasi “C”, 60-80 arasi “B”, 80’nin uzerinde ise “A” , //gecersiz not girildiginde uyari verelim/*
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen o'dan 100'e kada bir not girin");
double note= scan.nextDouble();
if (note<0 || note>100) {
    System.out.println("lutfen gecerli not girin"); }
else if(note<50) {
    System.out.println("Notunuz : D"); }

else if(note<60){
    System.out.println("notunuz : C"); }

else if(note<80){
    System.out.println("notunuz : B");}
    else {
    System.out.println("notunuz : A");}


}


    }


