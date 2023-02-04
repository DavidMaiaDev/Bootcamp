package br.com.bootcamp.dominio;

import java.time.LocalDate;

public class Mentorias {

    private String titulo;
    private String descricao;
    private LocalDate data;


    public Mentorias() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String desccricao) {
        this.descricao = desccricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentorias{" +
                "titulo='" + titulo + '\'' +
                ", desccricao='" + descricao + '\'' +
                ", data=" + data +
                '}';
    }
}
