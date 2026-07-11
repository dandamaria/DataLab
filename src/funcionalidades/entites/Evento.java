package funcionalidades.entites;

import java.time.LocalDate;

public class Evento {
    private final String nome;
    LocalDate data;

    public Evento(String nome, LocalDate data) {
        this.nome = nome;
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getData() {
        return data;
    }
}
