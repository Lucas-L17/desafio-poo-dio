import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println();

        Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
        Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        conteudosInscritos = devCamila.getConteudosInscritos();
        System.out.println("Conteúdos Inscritos Camila:");
        conteudosInscritos.forEach(System.out::println);
        System.out.println();
        System.out.println("--- Progredindo ---");
        devCamila.progredir();
        System.out.println("--- Progredindo ---");
        devCamila.progredir();
        System.out.println();
        conteudosInscritos = devCamila.getConteudosInscritos();
        System.out.println("Conteúdos Inscritos Camila:");
        conteudosInscritos.forEach(System.out::println);
        System.out.println();
        conteudosConcluidos = devCamila.getConteudosConcluidos();
        System.out.println("Conteúdos Concluídos Camila:");
        conteudosConcluidos.forEach(System.out::println);
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println();
        System.out.println("-----------------------------------");
        System.out.println();

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        conteudosInscritos = devJoao.getConteudosInscritos();
        System.out.println("Conteúdos Inscritos João:");
        conteudosConcluidos.forEach(System.out::println);
        System.out.println();
        System.out.println("--- Progredindo ---");
        devJoao.progredir();
        System.out.println("--- Progredindo ---");
        devJoao.progredir();
        System.out.println("--- Progredindo ---");
        devJoao.progredir();
        conteudosInscritos = devJoao.getConteudosInscritos();
        System.out.println("Conteúdos Inscritos João:");
        conteudosInscritos.forEach(System.out::println);
        System.out.println();
        conteudosConcluidos = devJoao.getConteudosConcluidos();
        System.out.println("Conteúdos Concluídos João:");
        conteudosConcluidos.forEach(System.out::println);
        System.out.println("XP:" + devJoao.calcularTotalXp());

    }

}
