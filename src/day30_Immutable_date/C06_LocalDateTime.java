package day30_Immutable_date;

import java.time.LocalDateTime;

public class C06_LocalDateTime {
    public static void main(String[] args) {
        LocalDateTime tarihsaat= LocalDateTime.now();
        System.out.println(tarihsaat);
        System.out.println(tarihsaat.plusMonths(3).plusHours(100));
        System.out.println(tarihsaat.minusMonths(12).plusMonths(13));
    }
}
