package funcionalidades;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CalculaIdade {
    public static void calculaIdade(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma data no formato dia/mês/ano");
        String input = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse(input,formatter);
        LocalDate now = LocalDate.now();
        Period period = Period.between(localDate, now);
        System.out.println("Você tem: "+period.getYears()+" anos "+period.getMonths()+" meses e "+period.getDays()+" dias");

    }
}
