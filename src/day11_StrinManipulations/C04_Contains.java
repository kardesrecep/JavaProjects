package day11_StrinManipulations;

public class C04_Contains {
    public static void main(String[] args) {
        /*
            Soru 2) Kullanicidan bir cumle isteyin.
            Cumle “buyuk” kelimesi iceriyorsa tum cumleyi buyuk harf olarak,
            “kucuk” kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin,
            iki kelimeyi de icermiyorsa “Cumle kucuk yada buyuk kelimesi icermiyor” yazdirin.
         */
        String cumle="Java buyuk, dunya kucuk";
        cumle=cumle.toLowerCase();
        // requirements'de buyuk harf kucuk harf hassasiyeti hakkinda bir sey soylenmemis
        // ikici olarak da her iki kelimeyi de icerme durumu aciklanmamis
        // bu durumda gorevi bize kim verdiyse ona sormak lazim
        // ek requirements : ikisini de iceriyorsa "Karar ver buyuk mu yazdirayim, kucuk mu ?"
        // case sensitive olmasin
        if (cumle.contains("kucuk") && cumle.contains("buyuk")){
            System.out.println("Karar ver buyuk mu yazdirayim, kucuk mu ?");
        } else if (cumle.contains("kucuk")){
            System.out.println(cumle.toLowerCase());
        } else if(cumle.contains("buyuk")){
            System.out.println(cumle.toUpperCase());
        } else{
            System.out.println("Cumle kucuk yada buyuk kelimesi icermiyor");
        }
    }
}
