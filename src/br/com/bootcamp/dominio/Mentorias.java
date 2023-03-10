package br.com.bootcamp.dominio;

import java.time.LocalDate;

public class Mentorias extends Conteudo {

    private LocalDate data;


    public Mentorias() {
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentorias: \n" +
                "titulo: " + getTitulo() +
                ", desccricao: " + getDescricao() +
                ", data: " + data;
    }
}
