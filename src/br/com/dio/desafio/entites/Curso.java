package br.com.dio.desafio.entites;

public class Curso extends Conteudo{

    private Integer cargaHorario;

    @Override
    public Double calcularXp() {
        return XP_PADRAO * cargaHorario;
    }

    public Integer getCargaHorario() {
        return cargaHorario;
    }

    public void setCargaHorario(Integer cargaHorario) {
        this.cargaHorario = cargaHorario;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHorario='" + cargaHorario + '\'' +
                '}';
    }
}
