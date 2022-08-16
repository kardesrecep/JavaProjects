package day17_nestedForLoop;

public class C01_NestedForLoop {
    public static void main(String[] args) {
        //verilen stringteki kullanilan harfleri tekrRarsiz olarak yazdirip
        //kelimede kullanilan farkli harf sayisini veren bir method yapiniz
        String input="Al su takatukalari takatukaciya götür ve takatukalatip geri getir";
        tekrarsizYap(input);
    }

    public static void tekrarsizYap(String input) {
        String benzersizInput="";

        String islenecekKelime=input.replaceAll("\\W","");
        System.out.print(islenecekKelime.substring(0,1));
        benzersizInput+=input.substring(0,1);

        for (int i = 0; i <=islenecekKelime.length()-1; i++) {
            if(!benzersizInput.contains(islenecekKelime.substring(i,i+1))){
                System.out.print(","+islenecekKelime.substring(i,i+1));
                benzersizInput+=islenecekKelime.substring(i,i+1);

            }

        }
        System.out.println("");
        System.out.println("input = " + input);
        System.out.println("benzersizInput = " + benzersizInput);
    }
}
