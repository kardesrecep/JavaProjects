package day24_arrayLists_forEachLoopp;

import java.util.ArrayList;
import java.util.List;

public class C08_ortakelemanlariBul {
    public static void main(String[] args) {
        String []arr1={"Ali","Veli","Can","Ayla"};
        String []arr2={"Ali","Hasan","Ayse","Baris"};
        List<String>ortakIsimler=new ArrayList<>();
        for (String each1:arr1
             ) {
            for (String each2:arr2
                 ) {
                if (each1.equalsIgnoreCase(each2)){
                    ortakIsimler.add(each1);
                }

            }
            if (ortakIsimler.isEmpty()){
                System.out.println("hic ortak eleman yok");
            }else{
                System.out.println("her iki arraydaki ortak elemanlar = "+ortakIsimler);
            }

        }

    }

}
