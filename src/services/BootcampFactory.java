package services;

import entities.*;

import java.util.Set;

public class BootcampFactory {

    public static Bootcamp criarBootcamp(String nome, String descricao){
        Bootcamp bootcamp = new Bootcamp(nome);
        //conteudos.forEach(bootcamp::addConteudo);
        return bootcamp;
    }
}
