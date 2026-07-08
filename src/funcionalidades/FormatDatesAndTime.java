package funcionalidades;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormatDatesAndTime {
    public static void formataDatasEHoras(LocalDateTime hour){
        DateTimeFormatter form1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter form2 = DateTimeFormatter.ISO_DATE;
        DateTimeFormatter form3 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        DateTimeFormatter form4 = DateTimeFormatter.ofPattern("EEEE");
        DateTimeFormatter form5 = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        DateTimeFormatter form6 = DateTimeFormatter.ofPattern("HH'h'mm");


        System.out.println(hour.format(form1));
        System.out.println(hour.format(form2));
        System.out.println(hour.format(form3));
        System.out.println(hour.format(form4));
        System.out.println(hour.format(form5));
        System.out.println(hour.format(form6));
    }
}
