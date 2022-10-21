import br.com.dio.desafio.entites.Curso;
import br.com.dio.desafio.entites.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso = new Curso();

        curso.setTitulo("curso java");
        curso.setDescricao("Descrição curso java");
        curso.setCargaHorario(8);

        Mentoria mentoria = new Mentoria();

        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setTitulo("Mentoria Java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso);
        System.out.println(mentoria);
    }
}
