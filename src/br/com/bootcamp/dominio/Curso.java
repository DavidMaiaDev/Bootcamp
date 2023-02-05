package br.com.bootcamp.dominio;

public class Curso extends Conteudo {

    private int cargaHoraria;


    public Curso() {
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * this.cargaHoraria;
    }
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso: \n" +
                "titulo: " + getTitulo()  +
                ", descrição: " + getDescricao() +
                ", CargaHoraria: " + cargaHoraria;
    }
}
