import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso de POO em Java");
        curso1.setCargaHoraria(40);

        Curso curso2 = new Curso();
        curso2.setTitulo("JavaScript");
        curso2.setDescricao("Curso de JavaScript");
        curso2.setCargaHoraria(30);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Java Como Programar");
        mentoria1.setDescricao("Mentoria em Java com POO");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("JavaScript Como Programar");
        mentoria2.setDescricao("Mentoria em JavaScript com Node.js");
        mentoria2.setData(LocalDate.now());

        System.out.println(curso1.toString());
        System.out.println(curso2.toString());
        System.out.println(mentoria1.toString());
        System.out.println(mentoria2.toString());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Santander Java Backend");
        bootcamp.setDescricao("Bootcamp Java patrocinado pelo Santander");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);
        bootcamp.getConteudos().add(mentoria2);
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Conteudos do Bootcamp: "+ bootcamp.getConteudos());
        System.out.println("-----------------------------------------------------------------------------");
        Dev fernanda = new Dev("Fernanda Pestana");
        Dev camila = new Dev("Camila");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println(fernanda.getNome() + " - Conteudos Inscritos: "+fernanda.getConteudosInscritos());
        System.out.println(fernanda.getNome() + " - Conteudos Concluidos: "+fernanda.getConteudosConcluidos());
        System.out.println(camila.getNome() + " - Conteudos Inscritos: "+camila.getConteudosInscritos());
        System.out.println(camila.getNome() + " - Conteudos Concluidos: "+camila.getConteudosConcluidos());
        System.out.println("-----------------------------------------------------------------------------");
        fernanda.inscreverBootcamp(bootcamp);
        System.out.println("Fernanda inscrita no Bootcamp!");
        camila.inscreverBootcamp(bootcamp);
        System.out.println("Camila inscrita no Bootcamp!");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println(fernanda.getNome() + " - Conteudos Inscritos: "+fernanda.getConteudosInscritos());
        System.out.println(fernanda.getNome() + " - Conteudos Concluidos: "+fernanda.getConteudosConcluidos());
        System.out.println(fernanda.getNome() + " - XP: "+fernanda.calcularTotalXP());
        System.out.println(camila.getNome() + " - Conteudos Inscritos: "+camila.getConteudosInscritos());
        System.out.println(camila.getNome() + " - Conteudos Concluidos: "+camila.getConteudosConcluidos());
        System.out.println(camila.getNome() + " - XP: "+camila.calcularTotalXP());
        System.out.println("-----------------------------------------------------------------------------");
        fernanda.progredir();
        System.out.println("Fernanda progrediu no Bootcamp!");
        camila.progredir();
        System.out.println("Camila progrediu no Bootcamp!");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println(fernanda.getNome() + " - Conteudos Inscritos: "+fernanda.getConteudosInscritos());
        System.out.println(fernanda.getNome() + " - Conteudos Concluidos: "+fernanda.getConteudosConcluidos());
        System.out.println(fernanda.getNome() + " - XP: "+fernanda.calcularTotalXP());
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println(camila.getNome() + " - Conteudos Inscritos: "+camila.getConteudosInscritos());
        System.out.println(camila.getNome() + " - Conteudos Concluidos: "+camila.getConteudosConcluidos());
        System.out.println(camila.getNome() + " - XP: "+camila.calcularTotalXP());

    }
}