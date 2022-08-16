package day17_nestedForLoop;

import java.util.Scanner;

public class C05_nestedforloopscn {
    public static void main(String[] args) {
         /*
        verieln inputa göre *lardan olusan bir ucgen olusturun
        ornek input=4 ise
        *
        * *
        * * *
        * * * *
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("ucgenın kac satir olacagını gir");
        int input= scan.nextInt();
        for (int i = 0; i <=input ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("* ");

            }
            System.out.println("");
        }
    }
}


