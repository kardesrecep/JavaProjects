package day14_MethodCreation;

public class C02_MethodCreation {
    public static void main(String[] args) {
        //verilen 3 basamakli bir sayinin
        //rakamlari toplamini yazdiran method olusturalim
        int input=423;
        rakamlaritopla(input);
    }

    public static void rakamlaritopla(int input) {
        int birlerBasamagi=0;
        int rakamlarToplami=0;
        int temp=423;

        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;

        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;

        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;

        System.out.println("Girdiginiz"+temp+"sayisinin rakamlar toplami:"+rakamlarToplami);
    }


}
