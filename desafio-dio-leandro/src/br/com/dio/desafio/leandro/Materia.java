package br.com.dio.desafio.leandro;

public class Materia {
    private String titulo;
    private String descricao;

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

    @Override
    public String toString() {
        return "Materia='" + titulo + '\'' +
                ", descricao='" + descricao + '\'';
    }
}
