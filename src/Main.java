import br.com.dio.desafio.entites.Bootcamp;
import br.com.dio.desafio.entites.Curso;
import br.com.dio.desafio.entites.Dev;
import br.com.dio.desafio.entites.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso = new Curso();

        curso.setTitulo("curso java");
        curso.setDescricao("Descrição curso java");
        curso.setCargaHorario(8);

        Curso curso1 = new Curso();

        curso1.setTitulo("curso js");
        curso1.setDescricao("Descrição curso js");
        curso1.setCargaHorario(4);

        Mentoria mentoria = new Mentoria();

        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setTitulo("Mentoria Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Bootcamp Java developer");
        bootcamp.setDescricao("Descrição Bootcamp Java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        Dev devArtur =  new Dev();
        devArtur.setNome("Artur");
        devArtur.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Artur:" + devArtur.getConteudosInscritos());
        devArtur.progredir();
        devArtur.progredir();
        System.out.println("-");
        System.out.println("Conteudos Concluidos Artur:" + devArtur.getConteudosConcluidos());
        System.out.println("Conteudos Inscritos Artur:" + devArtur.getConteudosInscritos());
        System.out.println("XP: " + devArtur.calcularXp());

        System.out.println("-------------------------------");

        Dev dev1 =  new Dev();
        dev1.setNome("Midorya");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Midoriya:" + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        dev1.progredir();
        System.out.println("-");
        System.out.println("Conteudos Concluidos Midoriya: " + dev1.getConteudosConcluidos());
        System.out.println("Conteudos Inscritos Midoriya:" + dev1.getConteudosInscritos());
        System.out.println("XP: " + dev1.calcularXp());
    }
}
