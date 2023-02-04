import br.com.bootcamp.dominio.Curso;
import br.com.bootcamp.dominio.Mentorias;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso(), curso2 = new Curso();

        curso1.setTitulo("Java");
        curso1.setDesccricao("Java Básico");
        curso1.setCargaHoraria(5);


        curso2.setTitulo("Python");
        curso2.setDesccricao("Python Básico");
        curso2.setCargaHoraria(4);

        Mentorias mentoria1 = new Mentorias(), mentoria2 = new Mentorias();

        mentoria1.setTitulo("Aprendendo Java na Prática");
        mentoria1.setDescricao("Se torne um Dev Java");
        mentoria1.setData(LocalDate.now());

        mentoria2.setTitulo("Aprendendo Python na Prática");
        mentoria2.setDescricao("Se torne um Dev Python");
        mentoria2.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(mentoria2);
    }
}