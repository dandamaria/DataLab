package funcionalidades;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ComparaDatas {
    public static void comparaDatas(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe uma data: dia/mês/ano");
        String resp1 = scanner.nextLine();
        System.out.println("Informe outra data: dia/mês/ano");
        String resp2 = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate date1 = LocalDate.parse(resp1,formatter);
        LocalDate date2 = LocalDate.parse(resp2,formatter);

        if (date1.isEqual(date2)){
            System.out.println("São duas datas iguais");
        }
        else if (date1.isBefore(date2)){
            System.out.println("A 1° data vem antes da 2° data");
            Period period = Period.between(date1,date2);
            System.out.println("A diferença entre elas: ");
            System.out.println(period.getYears()+" anos "+period.getMonths()+" meses e "+ period.getDays()+" dias");
        }else{
            System.out.println("A 2° data vem antes da 1° data");
            Period period = Period.between(date2,date1);
            System.out.println("A diferença entre elas: ");
            System.out.println(period.getYears()+" anos "+period.getMonths()+" meses e "+ period.getDays()+" dias");
        }


    }
}
