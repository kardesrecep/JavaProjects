package day04_dataCasting;

public class C04_ExplictNarrowing {
    public static void main(String[] args) {

        int sayi1=50;

        /* genis data turundeki degeri dar data turundekı varıableye atamak istersek java sizin genıs data turundekı degerın dar data turununu sinirlarina uyup uymayaacagını  calıstırana kadar bilemez, java risk almaz.
        java riski sifira indirmek icin  sorun olursa sorumlugu kabul etmnzı ister.
        bunn icin degerin onun parantez ıcıne ıstedgımz data turunu yazmamız yetrlıdır
        bu riski üstlendigimizde  3 durum olusur
        1- bizxim degerimziz, dar kalip degerine uygun olursa hıc bır kayıp olmadan cast olur
        2- double bir sayiyi int'a cast etmek gibi durumlarda data kaybı olabilir
         */



        byte sayi2= (byte)sayi1;
        System.out.println(sayi2);




    }
}
