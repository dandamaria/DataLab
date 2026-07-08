package funcionalidades;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;

public class MostrarDataHoraAtual {
    public static void mostrarDataHoraAtual() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd 'de' LLLL 'de ' yyyy'.' HH:mm:ss");
        System.out.println(now.format(dateTimeFormatter));


    }
}
