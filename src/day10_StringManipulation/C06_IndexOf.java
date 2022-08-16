package day10_StringManipulation;

public class C06_IndexOf {
    public static void main(String[] args) {
        String str= "Java ogrenmek cok guzel";
        System.out.println(str.indexOf("o")); // 5
        System.out.println(str.indexOf("z"));

        System.out.println(str.indexOf('g')); // 6
        System.out.println(str.indexOf("t")); // bana integer donduruyor
        // int'de yok diye bir deger bulunmuyor
        // 0 dersek J'nin index'idir
        // - bir deger donerse biz aranan string'in str'da olmadigini anlariz
        // Java -1 dondurmeyi tercih etmistir
        String str5 = "wertyuio;lsdfgpoiuytrwsdfghjklp0oiuytwsdfghjkliuytrsdfghjk";
        // str5'de p harfi var midir ?
        if (str5.indexOf("=")==-1){
            System.out.println("str5 de istenen karakter kullanilmamis");
        }else{
            System.out.println("str5'de istenen karakter kullanilmis");
        }
    }
}











