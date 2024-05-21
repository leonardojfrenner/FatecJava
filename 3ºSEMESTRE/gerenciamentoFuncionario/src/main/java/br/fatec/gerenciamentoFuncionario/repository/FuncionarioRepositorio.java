package br.fatec.gerenciamentoFuncionario.repository;

import br.fatec.gerenciamentoFuncionario.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FuncionarioRepositorio extends JpaRepository<Funcionario, Long> {


    List<Funcionario> findByDepartamentoNome(String nomeDepartamento);

    List<Funcionario> findByNome(String nomeFuncionario);

    @Query("SELECT f FROM Funcionario f WHERE f.salario > ?1 AND f.departamento.nome = ?2")
    List<Funcionario> findBySalarioAndDepartamento(Double salario, String nomeDepartamento);
}
