package day22_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C06_list {
    public static void main(String[] args) {
       /*
          array'i array yapan sembol [] idi
          arrayList de ise <> diamond(elmas) kullaniriz
         */
        List<String> isimler= new ArrayList<>();
        System.out.println(isimler); // []
        // bir list'e eleman eklemek istersek
        isimler.add("Basak");
        System.out.println(isimler.add("Ayse")); // true doner
        /*
         String'de bir method calistirdigimizda
         assign yapmazsak String degismiyordu
         String isim="Suleyman"
         isim.toUpperCase(); // SULEYMAN
         sout(isim) --> Suleyman
         */
        System.out.println(isimler); // [Basak, Ayse]
        /*
         List'in tek kotu tarafi array alt yapisini kullandigi icin
         elemanlari birer birer eklemek zorunda olmamizdir
         */
    }
}
