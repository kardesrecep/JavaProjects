package day15_overloading_forloop;

public class C01_returnMethod {
    public static void main(String[] args) {

        int sayi1=10;
        int sayi2=5;
        int sonuc=carpGetir(sayi1,sayi2);
        System.out.println(sayi1*sayi2);
    }

    public static int carpGetir(int sayi1, int sayi2) {
        return sayi1*sayi2;
    }
}
