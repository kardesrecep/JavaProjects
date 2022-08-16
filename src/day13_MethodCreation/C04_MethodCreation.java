package day13_MethodCreation;

public class C04_MethodCreation {
    public static void main(String[] args) {
        int input1=30;
        int input2=20;
        //method 4 adimda olusturulur
        //1.adim method call
        //2-) argument eklenmesi gerekiyorsa ekleyelim
        // eger methodun return typi voidden farklı olacaksa bir variable olusturup
        //method calli assign edelim

        topla(input1,input2);

    }

    public static void topla(int input1, int input2) {
        //3.adim method deklarosyonunda degistirilmesi gereken bolumleri degistir
        //(acces modifier, return type vb.)

        //4.adim) eger return type void disinda bir seyse
        //return keywordu ve doncek degeri heaplayalim
        System.out.println("girilen iki sayinin toplami:"+ (input1+input2));
    }

}
