package entities;

import services.CalculoXp;

public class Curso extends Conteudo implements CalculoXp {
    private Integer cargaHoraria;

    public Curso(String tittulo, String descricao, Integer cargaHoraria) {
        super(tittulo, descricao);
        this.cargaHoraria = cargaHoraria;
    }


    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    @Override
    public Double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{ "
                + getTitulo() +
                ", descricao: " + getDescricao() +
                ", Carga Horaria: " + cargaHoraria +
                '}';
    }


}
