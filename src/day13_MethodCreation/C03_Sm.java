package day13_MethodCreation;

public class C03_Sm {
    public static void main(String[] args) {

        String str= "Java ogrenmek123 cok guzel@";
        str=str.trim();
        str=str.replaceAll("\\d","");
        str=str.replaceAll("@","");
        str=str.replaceAll("C","c");
        str=str+".";
        System.out.println(str);

    }
}
