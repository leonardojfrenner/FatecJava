package br.edu.fatec.application;

import br.edu.fatec.application.model.Aluno;
import br.edu.fatec.application.model.Disciplina;
import br.edu.fatec.application.repository.AlunoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

    @Autowired
    private AlunoRepository alunoRepository;

public class Application implements CommandLineRunner {


    @Override
    public void run(String... args) throws Exception {
        System.out.println("ok");
        Aluno aluno = new Aluno("Leo","12345","leo@leo.com");
        Disciplina disciplina = new Disciplina("TP2","Segunda 15:00-18:30");
        aluno.setDisciplinas(disciplina);
        alunoRepository.save(aluno);
    }
}
