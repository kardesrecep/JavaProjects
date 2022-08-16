package day15_overloading_forloop;

public class C04_overloading {
    public static void main(String[] args) {
        topla(5,7);
        topla(5.2,3);
        topla(3.4,6.1);
        topla(5,6.2);
    }
    public static void topla(int sayi1,int sayi2){
        System.out.println("iki integerin toplami:"+(sayi1+sayi2));
    }
    public static void topla(double sayi1,int sayi2) {
        System.out.println("bir double ve bir integerin toplami:" + (sayi1 + sayi2));
    }


    public static void topla(double sayi1,double sayi2){
        System.out.println("iki doublenin toplami:"+(sayi1+sayi2));
    }

}


