package day16_forloop;

import java.util.Scanner;

public class C04_forloop {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 100'den kucuk bir pozitif tam sayi giriniz");
        int sayi= scan.nextInt();

        for (int i = 1; i <=sayi ; i++) {
            if (i%3==0&&i%5==0){
                System.out.print("java guzeldir"+"\n ");
            }else if(i%5==0){
                System.out.print("guzeldir"+" ");

            }else if(i%3==0){
                System.out.print("java"+" ");
            }else{
                System.out.print(i+" ");
            }

        }

    }
}
