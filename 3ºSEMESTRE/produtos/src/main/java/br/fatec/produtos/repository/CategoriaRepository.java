package br.fatec.produtos.repository;

import br.fatec.produtos.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

    Categoria findByNome(String nomeCategoria);
    // Método para encontrar todas as categorias cujo nome começa com uma determinada letra
    @Query(value = "SELECT * FROM categorias WHERE nome LIKE ?%", nativeQuery = true)
    List<Categoria> findCategoriasByLetraInicial(String letraInicial);
}
