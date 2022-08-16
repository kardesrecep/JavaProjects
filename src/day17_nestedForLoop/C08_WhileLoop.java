package day17_nestedForLoop;

public class C08_WhileLoop {
    public static void main(String[] args) {
        //20den 50ye kadar cift sayialri yazdiralim
        //forloopla yapalim,
        int bas = 20;
        int bitiris = 50;
        for (int i = bas; i <= bitiris; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }

        }
        System.out.println("");
        int temp = bas;
        while (temp <= bitiris) {
    if(temp%2==0){
        System.out.print(temp+" ");

    }
    temp++;
        }
    }
}
