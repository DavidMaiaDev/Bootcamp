import br.com.bootcamp.dominio.Bootcamp;
import br.com.bootcamp.dominio.Curso;
import br.com.bootcamp.dominio.Dev;
import br.com.bootcamp.dominio.Mentorias;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("Java");
        curso1.setDescricao("Java Básico");
        curso1.setCargaHoraria(20);




        Mentorias mentoria1 = new Mentorias();

        mentoria1.setTitulo("Aprendendo Java na Prática");
        mentoria1.setDescricao("Se torne um Dev Java");
        mentoria1.setData(LocalDate.now());


        Bootcamp bootcamp1 = new Bootcamp();

        bootcamp1.setNome("Bootcamp Java Developer");
        bootcamp1.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(mentoria1);


        Dev dev1 = new Dev();
        dev1.setNome("David");
        dev1.inscreverBotcamp(bootcamp1);
        System.out.println("Conteúdos Inscritos: " + dev1.getConteudosInscritos());
        System.out.println("---------------------------------------------------------------");
        dev1.progredir();
        System.out.println("Conteúdos Inscritos: " + dev1.getConteudosInscritos());
        System.out.println("---------------------------------------------------------------");
        System.out.println("Contetúdos Concluidos: " + dev1.getConteudosConcluidos());
        System.out.println("---------------------------------------------------------------");
        System.out.println("XP: " + dev1.calcularTotalXP());




    }
}