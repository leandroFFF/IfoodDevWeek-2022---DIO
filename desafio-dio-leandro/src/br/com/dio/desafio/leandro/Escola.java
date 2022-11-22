package br.com.dio.desafio.leandro;

public class Escola {
    private String nomeEscola;
    private int qtdSalas;
    private Professor professor;
    private Diretor diretor;
    private Aluno aluno;

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nome) {
        this.nomeEscola = nome;
    }

    public int getQtdSalas() {
        return qtdSalas;
    }

    public void setQtdSalas(int qtdSalas) {
        this.qtdSalas = qtdSalas;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
}
