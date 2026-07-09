package funcionalidades;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalUnit;
import java.util.Scanner;

public class DiferencaEntreDatas {
    public static void diferencaEntreDatas(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira duas datas (com horários) no formato: dia/mês/ano Hora:minutos");
        System.out.println("Exemplo: 08/10/2021 23:36");
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime one = LocalDateTime.parse(input1,formatter);
        LocalDateTime two = LocalDateTime.parse(input2,formatter);
        Duration duration = Duration.between(one,two);

        long days = duration.toDays();
        long hours = duration.toHours()%24;
        long minutes = duration.toMinutes()%60;

        System.out.println(duration);

        System.out.println(days+" dias");
        System.out.println(hours+" horas");
        System.out.println(minutes+" minutos");
    }
}
