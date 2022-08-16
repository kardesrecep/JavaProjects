package day17_nestedForLoop;

public class C07_NestedForLoop {
    public static void main(String[] args) {
        /*verieln stringi asagıdaki gibi yazdiran bir program yazin
        input="iclalAysem
         */
        String input="BAYBURT";
        for (int i =1; i <=input.length() ; i++) {
            for (int j = 1; j <=i ; j++) {
               ;
                System.out.print(input.substring(j-1,j));
            }
            System.out.println("");
        }
    }
}
