package day16_forloop;

public class C01_forloop {
    public static void main(String[] args) {

        int input=20;

        for (int i = 1; i <=input ; i++) {
            if ((input%i==0)){
                System.out.println(i+" ");
            }

        }
    }
}
