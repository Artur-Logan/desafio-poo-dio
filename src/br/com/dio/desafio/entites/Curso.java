package br.com.dio.desafio.entites;

public class Curso {

    private String titulo;
    private String descricao;
    private Integer cargaHorario;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHorario='" + cargaHorario + '\'' +
                '}';
    }
}
