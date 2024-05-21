package br.edu.fatecpg.cosumoApi;

import br.edu.fatecpg.cosumoApi.model.Endereco;
import br.edu.fatecpg.cosumoApi.model.NovoEndereco;
import br.edu.fatecpg.cosumoApi.repository.NovoEnderecoRepository;
import br.edu.fatecpg.cosumoApi.service.ConsomeApi;
import br.edu.fatecpg.cosumoApi.service.ConverteDados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class ConsumoApiApplication implements CommandLineRunner {

	@Autowired
	private NovoEnderecoRepository repositorio;

	public static void main(String[] args) {
		SpringApplication.run(ConsumoApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);
		try (Scanner sc = new Scanner(System.in)) {
			int opcao;

			do {
				exibirMenu();
				opcao = obterOpcaoUsuario(sc);
				processarOpcao(opcao, sc);
			} while (opcao != 3);

			System.out.println("Programa encerrado.");
		}
	}

	private void exibirMenu() {
		System.out.println("Escolha uma opção: (1) Consultar CEP (2) Mostrar CEPs cadastrados (3) Sair");
	}

	private int obterOpcaoUsuario(Scanner sc) {
		System.out.print("Digite sua opção: ");
		if (sc.hasNextInt()) {
			return sc.nextInt();
		} else {
			sc.nextLine();
			System.out.println("Entrada inválida. Por favor, insira um número.");
			return -1;
		}
	}

	private void processarOpcao(int opcao, Scanner sc) {
		ConsomeApi consomeApi = new ConsomeApi();
		ConverteDados converteDados = new ConverteDados();

		switch (opcao) {
			case 1:
				System.out.print("Digite um CEP: ");
				if (sc.hasNextInt()) {
					int cep = sc.nextInt();
					String json = consomeApi.retornaJson("https://viacep.com.br/ws/" + cep + "/json/");
					Endereco endereco = converteDados.converteDados(json, Endereco.class);
					NovoEndereco novoEndereco = new NovoEndereco(endereco);
					repositorio.save(novoEndereco);
					System.out.println("CEP salvo com sucesso!");
				} else {
					System.out.println("Entrada inválida. Tente novamente.");
					sc.nextLine(); // Limpa entrada inválida
				}
				break;

			case 2:
				List<NovoEndereco> enderecos = repositorio.findAll();
				System.out.println("CEPs cadastrados:");
				enderecos.forEach(System.out::println);
				break;

			case 3:
				System.out.println("Obrigado! Fim do programa.");
				break;

			default:
				System.out.println("Opção inválida. Por favor, escolha entre 1 e 3.");
				break;
		}
	}
}
