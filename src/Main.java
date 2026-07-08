import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean sair = false;
        Scanner scanner = new Scanner(System.in);
        int option=-1;

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
                    //mostrar data e hora atual
                    break;
                case 2:
                    //formatar datas
                    break;
                case 3:
                    //calcular idade
                    break;
                case 4:
                    //quanto tempo falta?
                    break;
                case 5:
                    //diferença entre datas
                    break;
                case 6:
                    //trabalhar com instant
                    break;
                case 7:
                    //somar/subtrair tempo
                    break;
                case 8:
                    //comparar datas
                    break;
                case 9:
                    //calendário pessoal
                    break;
                case 0:
                    sair = true;
                    break;
            }
        }
    }
    public static void mostraMenu(){
        System.out.println("----- Laboratório de Datas ------");
        System.out.println("1 - Mostrar data e hora atual\n" +
                "2 - Formatar datas\n" +
                "3 - Calcular idade\n" +
                "4 - Quanto tempo falta?\n" +
                "5 - Diferença entre datas\n" +
                "6 - Trabalhar com Instant\n" +
                "7 - Somar/Subtrair tempo\n" +
                "8 - Comparar datas\n" +
                "9 - Calendário pessoal\n" +
                "0 - Sair");
    }
}