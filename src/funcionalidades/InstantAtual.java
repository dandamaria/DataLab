package funcionalidades;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Map;

public class InstantAtual {
    public static void trabalharComInstant(){
        Instant now = Instant.now();
        System.out.println(now);

        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);

        ZonedDateTime saoPaulo = now.atZone(ZoneId.of("America/Sao_Paulo"));
        ZonedDateTime londres = now.atZone(ZoneId.of("Europe/London"));
        ZonedDateTime tokio = now.atZone(ZoneId.of("Asia/Tokyo"));

        System.out.println("SP: "+saoPaulo);
        System.out.println("LDN: "+londres);
        System.out.println("TK: "+tokio);
    }
}
