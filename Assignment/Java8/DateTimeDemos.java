package Java8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeDemos {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalDate independant = LocalDate.of(2001,3,29);
        System.out.println(independant);

        String str = "2001-03-28";
        LocalDate dob = LocalDate.parse(str);
        System.out.println(dob);
        LocalDate date1 = LocalDate.now();
        System.out.println(date1);
        System.out.println(date1.minusYears(23));
        DateTimeFormatter myfor = DateTimeFormatter.ofPattern("dd/MM/yy");
        System.out.println(date1);
    }
}
