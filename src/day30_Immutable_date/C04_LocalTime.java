package day30_Immutable_date;

import java.time.LocalTime;

public class C04_LocalTime {
    public static void main(String[] args) throws InterruptedException {
        LocalTime time1=LocalTime.now();//*****
        System.out.println(time1);
        Thread.sleep(3000);//*****
        System.out.println(time1);

    }
}
