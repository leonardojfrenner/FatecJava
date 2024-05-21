package br.edu.fatec.application.repository;

import br.edu.fatec.application.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AlunoRepository extends JpaRepository<Aluno,Long> {
    Aluno findAllById(int id);
    List<Aluno> findAlunoByNomeContainingIgnoreCase(String nome);
}
