package day15_overloading_forloop;

public class C06_StringTerseCevirme {
    public static void main(String[] args) {
        String input="java gun gectikce guzellesiyor";
        terstenYazdir(input);
    }

    public static void terstenYazdir(String input) {
        String tersInput=input.substring(input.length()-1);
        for (int i =input.length()-2; i >=0 ; i--) {
            tersInput+=input.substring(i,i+1);

        }
        System.out.println(tersInput);
    }
}
