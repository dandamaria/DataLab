package funcionalidades;
import funcionalidades.entites.Evento;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class CalendarioPessoal {
    static ArrayList<Evento> eventos = new ArrayList<>();

    public static void menu(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("""
                    Digite: '1' para cadastrar um novo evento
                    '2' para verificar os existentes e\s
                    '3' para sair desta funcionalidade""");
            int resposta = scanner.nextInt();
            if(resposta==1){
                cadastrar();
            } else if (resposta == 2) {
                listarEventos();
            }else if (resposta==3){
                break;
            }else {
                System.out.println("Opção escolhida inválida");
            }
        }
    }

    private static void cadastrar(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do evento");
        String nome = scanner.nextLine();

        System.out.println("Agora a data no formato dia/mês/ano");
        String dateNoFormat = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(dateNoFormat,formatter);

        Evento evento = new Evento(nome,date);
        eventos.add(evento);
    }
    private static void listarEventos(){
        for(Evento e : eventos){
            System.out.println("Evento: "+e.getNome());
            LocalDate now = LocalDate.now();
            if(now.isBefore(e.getData())){
                Period period = Period.between(now,e.getData());
                System.out.println("Faltam "+period.getYears()+" anos "+period.getMonths()+" meses e "+ period.getDays()+" dias");
            }else if(now.isAfter(e.getData())){
                Period period = Period.between(now,e.getData());
                System.out.println("Aconteceu há "+period.getYears()+" anos "+period.getMonths()+" meses e "+ period.getDays()+" dias");
            } else if (now.isEqual(e.getData())) {
                System.out.println("É hoje: "+e.getData().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            }
        }

    }
}
