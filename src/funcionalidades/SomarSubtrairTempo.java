package funcionalidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SomarSubtrairTempo {
    private static final Scanner scanner = new Scanner(System.in);

    public static void escolheOpcao(){
        System.out.println("Você quer somar ou subtrair datas?");
        String resp = scanner.nextLine().toUpperCase().trim();
        while (true){
            if (resp.equals("SOMAR")){
                somar();
                break;
            } else if (resp.equals("SUBTRAIR")) {
                subtrair();
                break;
            }else {
                System.out.println("Insira uma resposta válida: \"somar\" ou \"subtrair\"");
            }
        }

    }
    public static void somar(){
        System.out.println("Insira a data no formato: dia/mês/ano");
        String data = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse(data,formatter);

        System.out.println("Quanto tempo que adicionar?('dias' ou 'semanas' ou 'meses' ou 'anos')");
        String tempo = scanner.nextLine();
        switch (tempo) {
            case "dias" -> {
                System.out.println("Quantos dias?");
                int qtd = scanner.nextInt();
                LocalDate resultado = localDate.plusDays(qtd);
                System.out.println("Nova data: " + resultado);
            }
            case "semanas" -> {
                System.out.println("Quantas semanas?");
                int qtd = scanner.nextInt();
                LocalDate resultado = localDate.plusWeeks(qtd);
                System.out.println("Nova data: " + resultado);
            }
            case "meses" -> {
                System.out.println("Quantos meses?");
                int qtd = scanner.nextInt();
                LocalDate resultado = localDate.plusMonths(qtd);
                System.out.println("Nova data: " + resultado);
            }
            case "anos" -> {
                System.out.println("Quantos anos?");
                int qtd = scanner.nextInt();
                LocalDate resultado = localDate.plusYears(qtd);
                System.out.println("Nova data: " + resultado);
            }
        }
    }
    public static void subtrair(){
        System.out.println("Insira a data no formato: dia/mês/ano");
        String data = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse(data,formatter);

        System.out.println("Quanto tempo que subtrair?('dias' ou 'semanas' ou 'meses' ou 'anos')");
        String tempo = scanner.nextLine();
        switch (tempo) {
            case "dias" -> {
                System.out.println("Quantos dias?");
                int qtd = scanner.nextInt();
                LocalDate resultado = localDate.minusDays(qtd);
                System.out.println("Nova data: " + resultado);
            }
            case "semanas" -> {
                System.out.println("Quantas semanas?");
                int qtd = scanner.nextInt();
                LocalDate resultado = localDate.minusWeeks(qtd);
                System.out.println("Nova data: " + resultado);
            }
            case "meses" -> {
                System.out.println("Quantos meses?");
                int qtd = scanner.nextInt();
                LocalDate resultado = localDate.minusMonths(qtd);
                System.out.println("Nova data: " + resultado);
            }
            case "anos" -> {
                System.out.println("Quantos anos?");
                int qtd = scanner.nextInt();
                LocalDate resultado = localDate.minusYears(qtd);
                System.out.println("Nova data: " + resultado);
            }
        }
    }

}
