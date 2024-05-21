package br.fatec.gerenciamentoFuncionario.repository;

import br.fatec.gerenciamentoFuncionario.model.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentoRepositorio extends JpaRepository<Departamento, Long> {
    Departamento findByNomeIgnoreCase(String nomeDepartamento);
}
