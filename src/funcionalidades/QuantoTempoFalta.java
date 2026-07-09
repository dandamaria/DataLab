package funcionalidades;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class QuantoTempoFalta {
    public static void quantoTempoFalta(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma data no formato dia/mês/ano");
        String input = scanner.nextLine();

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(input, format);
        LocalDate now = LocalDate.now();

        long days = ChronoUnit.DAYS.between(now, date);
        Period period = Period.between(now, date);

        System.out.println("Faltam "+days +" dias");
        if(period.getYears()!=0){
            System.out.println("ou "+period.getYears()+" anos, "+period.getMonths()+" meses e "+period.getDays()+" dias");
        }else if(period.getMonths()!=0){
            System.out.println("ou "+period.getMonths()+" meses e "+period.getDays()+" dias");
        }

    }
}
