import entities.Bootcamp;
import entities.Curso;
import entities.Dev;
import entities.Mentoria;
import services.BootcampFactory;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso =  new Curso("Java","Curso massa",50);
        Curso curso1 = new Curso("Mysql", "Introdução ao mysql",30);

        Mentoria mentoria = new Mentoria("Mentoria de Java", "Ajudando os javeiros",LocalDate.now());

        Bootcamp bootcamp = BootcampFactory.criarBootcamp("Bootcamp Java","Bootcamp massa");
        bootcamp.addConteudo(mentoria);
        bootcamp.addConteudo(curso);

        Dev glauber = new Dev("Glauber Balsani");
        glauber.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos" + glauber.getConteudosInscritos());
        glauber.progredir();




    }
}