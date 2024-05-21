package br.fatec.produtos.repository;

import br.fatec.produtos.model.Categoria;
import br.fatec.produtos.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    List<Produto> findByCategoriaNome(String nomeCategoria);

    @Query(value = "SELECT nome FROM categorias WHERE nome LIKE ?1%", nativeQuery = true)
    List<String> findCategoriasByLetraInicial(String letraInicial);



}
