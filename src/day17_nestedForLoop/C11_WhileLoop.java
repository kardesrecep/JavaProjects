package day17_nestedForLoop;

public class C11_WhileLoop {
    public static void main(String[] args) {
        boolean dogruMu=false;
        int sayi =10;
        while(!dogruMu){
            if (sayi>20){ // sart saglandiginda while loop'un condition'i false olmali
                System.out.println("Bu islem tamam");
                dogruMu=true;
            }else { // sart saglanmadigi muddetce while loop'un kontrol ettigi degisken degismeli
                System.out.println("istenen sart saglanamadi" + sayi);
                sayi++;
            }
        }
    }
}










