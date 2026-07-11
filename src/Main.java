import funcionalidades.*;

import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean sair = false;
        Scanner scanner = new Scanner(System.in);
        int option;

        while (!sair){
            mostraMenu();
            System.out.println("escolha uma opção");
            while (true){
                try{
                    option = scanner.nextInt();
                    if(option<0 || option > 9 ){
                        System.out.println("Digite uma opção válida (um número entre 0 a 9)");
                        continue;
                    }
                    break;
                }catch (InputMismatchException e){
                    System.out.println("Digite uma opção válida (um número entre 0 a 9)");
                    scanner.nextLine();
                }
            }
            switch (option){
                case 1:
                    MostrarDataHoraAtual.mostrarDataHoraAtual();
                    break;
                case 2:
                    LocalDateTime now = LocalDateTime.now();
                    FormatDatesAndTime.formataDatasEHoras(now);
                    break;
                case 3:
                    CalculaIdade.calculaIdade();
                    break;
                case 4:
                    QuantoTempoFalta.quantoTempoFalta();
                    break;
                case 5:
                    DiferencaEntreDatas.diferencaEntreDatas();
                    break;
                case 6:
                    InstantAtual.trabalharComInstant();
                    break;
                case 7:
                    SomarSubtrairTempo.escolheOpcao();
                    break;
                case 8:
                    ComparaDatas.comparaDatas();
                    break;
                case 9:
                    CalendarioPessoal.menu();
                    break;
                case 0:
                    sair = true;
                    break;
            }
        }
    }
    public static void mostraMenu(){
        System.out.println("----- Laboratório de Datas ------");
        System.out.println("""
                1 - Mostrar data e hora atual
                2 - Formatar datas
                3 - Calcular idade
                4 - Quanto tempo falta?
                5 - Diferença entre datas
                6 - Trabalhar com Instant
                7 - Somar/Subtrair tempo
                8 - Comparar datas
                9 - Calendário pessoal
                0 - Sair""");
    }
}