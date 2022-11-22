import br.com.dio.desafio.leandro.*;

import javax.swing.*;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        /*----------- Matérias -------------*/
        Materia portugues = new Materia();
        portugues.setTitulo("Português");
        portugues.setDescricao("Aulas de português");

        Materia matematica = new Materia();
        matematica.setTitulo("Matemática");
        matematica.setDescricao("Aulas de matemática");

        /*----------- Professores -------------*/
        Professor professorPor = new Professor();
        professorPor.setNome("Alexandre");
        professorPor.setMateria(portugues);

        Professor professorMat = new Professor();
        professorMat.setNome("Adriano");
        professorMat.setMateria(matematica);

        /*----------- Diretor -------------*/
        Diretor diretor1 = new Diretor();
        diretor1.setNomeDiretor("Leonardo França");

        /*----------- Escola -------------*/
        Escola escola1 = new Escola();
        escola1.setNomeEscola("Escola Estadual Stoessel de Brito");
        escola1.setDiretor(diretor1);
        escola1.setQtdSalas(7);
        escola1.setProfessor(professorMat);
        escola1.setProfessor(professorPor);

        /*----------- Aluno -------------*/
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Leandro");
        aluno1.setIdade(14);
        aluno1.setSerie(9);

        /*----------- Saídas -------------*/
        System.out.println("Escola: " + escola1.getNomeEscola());
        System.out.println("Diretor: " + diretor1.getNomeDiretor());
        System.out.println("Quantidade de salas: " + escola1.getQtdSalas());
        System.out.println("Professor de "+ professorMat.getMateria().getTitulo() + ": " + professorMat.getNome());
        System.out.println("Professor de " + professorPor.getMateria().getTitulo() + ": " + professorPor.getNome());
        System.out.println("O Aluno: " + aluno1.getNome() + " tem " + aluno1.getIdade() + " anos de idade e está na " + aluno1.getSerie() + "a série.");
        System.out.println(escola1.getProfessor().getNome() + ", " + escola1.getProfessor().getMateria());
    }
}
