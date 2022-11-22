package br.com.dio.desafio.leandro;

import java.util.HashSet;
import java.util.Set;

public class Aluno {
    private String nome;
    private int idade;
    private int serie;
    private Set<Materia> materias = new HashSet<>();
    private Set<Professor> professores = new HashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public Set<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(Set<Materia> materias) {
        this.materias = materias;
    }

    public Set<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(Set<Professor> professores) {
        this.professores = professores;


    }

}
