package br.com.bootcamp.dominio;

public class Curso {
    private String titulo;
    private String desccricao;
    private int CargaHoraria;


    public Curso() {
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDesccricao() {
        return desccricao;
    }
    public void setDesccricao(String desccricao) {
        this.desccricao = desccricao;
    }
    public int getCargaHoraria() {
        return CargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        CargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", desccricao='" + desccricao + '\'' +
                ", CargaHoraria=" + CargaHoraria +
                '}';
    }
}
