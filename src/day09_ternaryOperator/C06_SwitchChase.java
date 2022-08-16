package day09_ternaryOperator;

public class C06_SwitchChase {
    public static void main(String[] args) {
        String input= "pazar";
        switch (input){
            case "pazartesi":
                System.out.println("haftaiçi");
                break;
            case "sali":
                System.out.println("haftaiçi");
                break;
            case "carsamba":
                System.out.println("haftaiçi");
                break;
            case "persembe":
                System.out.println("haftaiçi");
                break;
            case "cuma":
                System.out.println("haftaiçi");
                break;
            case "cumartesi":
                System.out.println("haftasonu");
                break;
            case "pazar":
                System.out.println("haftasonu");
                break;
            default:
                System.out.println("gecerli gun giriniz" );}
    }
}
