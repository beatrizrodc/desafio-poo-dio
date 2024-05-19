import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("curso de Java para iniciantes");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Python");
        curso2.setDescricao("curso de Python para nivel intermediário");
        curso2.setCargaHoraria(13);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("mentoria do curso de java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Web Developer");
        bootcamp.setDescricao("bootcamp web developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devBeatriz = new Dev();
        devBeatriz.setNome("Beatriz");
        devBeatriz.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Incritos Beatriz: " + devBeatriz.getConteudosInscritos());
        devBeatriz.progredir();
        devBeatriz.progredir();
        System.out.println("----");
        System.out.println("Conteúdos Incritos Beatriz: " + devBeatriz.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Beatriz: " + devBeatriz.getConteudosConcluidos());
        System.out.println("XP: " + devBeatriz.calcularTotalXp());

        System.out.println("-------------------");

        Dev devCarlos = new Dev();
        devCarlos.setNome("Carlos");
        devCarlos.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Incritos Carlos: " + devCarlos.getConteudosInscritos());
        devCarlos.progredir();
        devCarlos.progredir();
        devCarlos.progredir();
        System.out.println("----");
        System.out.println("Conteúdos Incritos Carlos: " + devCarlos.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Carlos: " + devCarlos.getConteudosConcluidos());
        System.out.println("XP: " + devCarlos.calcularTotalXp());

    }
}
