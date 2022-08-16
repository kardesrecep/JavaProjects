package day35_inheritancedaConstructorKullanimi;

public class Matematikciler extends LOgretmen{
    Matematikciler(){
        System.out.println("Matematik parametresiz cons");
    }
    Matematikciler(String isim){
        this();
        System.out.println("Matematik parametreli cons");
    }
    public static void main(String[] args) {
        Matematikciler obj1=new Matematikciler("Tugba");
    }
}










