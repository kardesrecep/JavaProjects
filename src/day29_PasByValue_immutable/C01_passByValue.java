package day29_PasByValue_immutable;

import java.util.Arrays;
import java.util.Random;

public class C01_passByValue {
    public static void main(String[] args) {
       /*
          4 elemanli bir array olusturalim
          sonra ayri bir method'da
          bu array'in 2. ve 4. elemanlarini
          100'den kucuk rastgele bir sayi ile degistirelim
          ve yeni halini yazdiralim
         */
        int[] arr={5,7,8,10};
        elemanDegistir(arr);
        System.out.println("main method'un icinde diger method calistiktan sonra : " + Arrays.toString(arr));
        // [5,7,8,10]
    }
    public static void elemanDegistir(int[] arr) {
        Random rnd=new Random();
        arr[1]=rnd.nextInt(100);
        arr[3]=rnd.nextInt(100);
        System.out.println("Method'un icinde : " + Arrays.toString(arr)); // [5, 29, 8, 13]
    }
}