package br.fatec.produtos;

import br.fatec.produtos.model.Categoria;
import br.fatec.produtos.model.Produto;
import br.fatec.produtos.repository.CategoriaRepository;
import br.fatec.produtos.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;
import java.util.List;

@SpringBootApplication
public class ProdutosApplication implements CommandLineRunner {

	@Autowired
	private ProdutoRepository produtoRepository;

	@Autowired
	private CategoriaRepository categoriaRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProdutosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		boolean adicionarMais = true;

		while (adicionarMais) {
			System.out.print("Digite um nome para o produto: ");
			String nomeProduto = sc.nextLine();

			System.out.printf("Atribua uma descrição para %s: ", nomeProduto);
			String descricaoProduto = sc.nextLine();

			System.out.printf("Qual valor de %s R$", nomeProduto);
			double valor = sc.nextDouble();
			sc.nextLine();

			System.out.printf("Qual categoria de %s ", nomeProduto);
			String nomeCategoria = sc.nextLine();

			Categoria categoria = categoriaRepository.findByNome(nomeCategoria);
			if (categoria == null) {
				categoria = new Categoria(nomeCategoria);
				categoriaRepository.save(categoria); // Salvar a categoria se ela não existir
			}

			Produto produto = new Produto(nomeProduto, descricaoProduto, valor, categoria);
			produtoRepository.save(produto);

			System.out.println(produto);

			System.out.print("Deseja adicionar mais produtos? (S/N): ");
			String resposta = sc.nextLine();
			if (!resposta.equalsIgnoreCase("S")) {
				adicionarMais = false;
			}
		}

		System.out.print("Digite o nome da categoria para encontrar seus produtos: ");
		String nomeCategoriaConsulta = sc.nextLine();
		List<Produto> produtosDaCategoria = produtoRepository.findByCategoriaNome(nomeCategoriaConsulta);
		System.out.println("Produtos da categoria " + nomeCategoriaConsulta + ":");
		produtosDaCategoria.forEach(System.out::println);

		System.out.print("Digite uma letra para encontrar categorias: ");
		String letraInicial = sc.nextLine().trim();
		List<String> categoriasPorLetra = produtoRepository.findCategoriasByLetraInicial(letraInicial);
		System.out.println("Categorias cujo nome começa com a letra " + letraInicial + ":");
		categoriasPorLetra.forEach(System.out::println);

		sc.close();
	}
}
