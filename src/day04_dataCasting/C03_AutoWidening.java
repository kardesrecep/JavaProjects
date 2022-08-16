package day04_dataCasting;

public class C03_AutoWidening {

    public static void main(String[] args) {

        //javada sayilarla ilgili data tipleri şunlardır:
       // byte <short <int <long< float< double

 // burada otowidening yaptık
byte sayi1=23;
short sayi2=55;

int sayi3= sayi1+sayi2;

double sayi4=sayi1*sayi2;

sayi4=(double)sayi2/sayi1; //53.0/23= 2.391

        System.out.println(sayi4);

        //burda oluşan veri kaybını engellemek için java outowidening  yapar
        // dar veri turundeki bir degeri genis veri turundeki variableye otomatik olarak assign yapar




    }
}
