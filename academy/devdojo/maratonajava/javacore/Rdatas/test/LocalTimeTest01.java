package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalTime;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime time =  LocalTime.of(23,32,12);
        LocalTime timenow =  LocalTime.now();
        System.out.println(time);
        System.out.println(timenow);
        System.out.println(time.getHour());
    }
}
