package day18_WhileLoop_doWhileLoop;

public class C01_WhileLoop {
    public static void main(String[] args) {
        char ilkHarf='f';
        char sonHarf='t';
        char temp=ilkHarf;
        String buyult="";

        while(temp<=sonHarf){
        buyult=(temp+"").toUpperCase();
        System.out.print(temp+" ");
        temp+=1;

    }
}
    }