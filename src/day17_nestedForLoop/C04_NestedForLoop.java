package day17_nestedForLoop;

public class C04_NestedForLoop {
    public static void main(String[] args) {
        /*
        verieln inputa göre *lardan olusan bir ucgen olusturun
        ornek input=4 ise
        *
        * *
        * * *
        * * * *
         */
        int input=4;
        for (int i = 0; i <=input ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("* ");

            }
            System.out.println("");
        }
    }
}
