package day30_Immutable_date;

import java.time.LocalDate;
import java.time.Period;

public class C07_Period {
    public static void main(String[] args) {
        LocalDate tarih1=LocalDate.of(2021,7,9);
        LocalDate bugun= LocalDate.now();
        Period period=Period.between(bugun,tarih1);
        System.out.println(period);
    }
}
