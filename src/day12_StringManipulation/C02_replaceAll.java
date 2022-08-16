package day12_StringManipulation;

public class C02_replaceAll {
    public static void main(String[] args) {
        String str="1Bu2gu3n Ja*va- cok g3uz/el";
        System.out.println(str);

    str=str.replace(" ","qazwsx");
        System.out.println(str);

    str=str.replaceAll("\\W","");
        System.out.println(str);

    str=str.replaceAll("\\d","");
        System.out.println(str);

    str=str.replaceAll("qazwsx"," ");
        System.out.println(str);
    }
}
