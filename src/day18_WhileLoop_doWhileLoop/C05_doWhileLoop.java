package day18_WhileLoop_doWhileLoop;

public class C05_doWhileLoop {
    public static void main(String[] args) {
        int bas=9;
        int bitis=190;
        int temp=bas;

        while(temp<bitis){
            if(temp%7==0){
                System.out.print(temp+" ");
            }
            temp++;
        }
        do {
            if (temp % 7 == 0) {
                System.out.print(temp + " ");
            }
            temp++;
        } while(temp<bitis);
}
}

