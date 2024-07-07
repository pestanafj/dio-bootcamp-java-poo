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


    }
}