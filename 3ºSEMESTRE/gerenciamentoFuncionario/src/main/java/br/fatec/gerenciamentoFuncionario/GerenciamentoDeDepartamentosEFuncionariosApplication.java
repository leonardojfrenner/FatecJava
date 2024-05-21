package br.fatec.gerenciamentoFuncionario;

import br.fatec.gerenciamentoFuncionario.model.Departamento;
import br.fatec.gerenciamentoFuncionario.model.Funcionario;
import br.fatec.gerenciamentoFuncionario.repository.DepartamentoRepositorio;
import br.fatec.gerenciamentoFuncionario.repository.FuncionarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class GerenciamentoDeDepartamentosEFuncionariosApplication implements CommandLineRunner {

	@Autowired
	private FuncionarioRepositorio funcionarioRepositorio;

	@Autowired
	private DepartamentoRepositorio departamentoRepositorio;

	public static void main(String[] args) {
		SpringApplication.run(GerenciamentoDeDepartamentosEFuncionariosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

//		List<Funcionario> funcionarios = new ArrayList<>();
//		List<Departamento> departamentos = new ArrayList<>();
//
//		System.out.print("Quantos departamentos serão cadastrados? ");
//		int numeroDepartamentos = sc.nextInt();
//		sc.nextLine();
//
//		for (int i = 0; i < numeroDepartamentos; i++) {
//			System.out.printf("Nome do %dº departamento: ", i + 1);
//			String nomeDepartamento = sc.nextLine();
//			System.out.printf("Telefone do %s: ", nomeDepartamento);
//			String telefoneDepartamento = sc.nextLine();
//			System.out.print("Descrição do departamento: ");
//			String descricaoDepartamento = sc.nextLine();
//
//			Departamento departamento = new Departamento(telefoneDepartamento, descricaoDepartamento, nomeDepartamento);
//			departamentos.add(departamento);
//		}
//
//
//		departamentoRepositorio.saveAll(departamentos);
//
//		System.out.print("Quantos funcionários serão cadastrados? ");
//		int numeroFuncionarios = sc.nextInt();
//		sc.nextLine();
//
//		for (int i = 0; i < numeroFuncionarios; i++) {
//			System.out.printf("Nome do %dº funcionário: ", i + 1);
//			String nomeFuncionario = sc.nextLine();
//			System.out.printf("CPF do %s: ", nomeFuncionario);
//			int cpf = sc.nextInt();
//			sc.nextLine();
//			System.out.printf("Salário do %s: ", nomeFuncionario);
//			double salario = sc.nextDouble();
//			sc.nextLine();
//
//			System.out.println("Selecione o departamento para o funcionário:");
//			for (int j = 0; j < departamentos.size(); j++) {
//				System.out.printf("%d - %s%n", j + 1, departamentos.get(j).getNome());
//			}
//			int escolha = sc.nextInt();
//			sc.nextLine();
//			Departamento departamentoEscolhido = departamentos.get(escolha - 1);
//
//			Funcionario funcionario = new Funcionario(cpf, nomeFuncionario, salario);
//			funcionario.setDepartamento(departamentoEscolhido);
//			funcionarios.add(funcionario);
//		}
//
//		funcionarioRepositorio.saveAll(funcionarios);
//
//		System.out.println("Funcionários cadastrados:");
//		for (Funcionario funcionario : funcionarios) {
//			System.out.println(funcionario);
//			System.out.println("Departamento: " + funcionario.getDepartamento());
//		}


		System.out.print("Digite o nome do departamento para ver seus funcionários: ");
		String nomeDepartamentoConsulta4 = sc.nextLine();
		List<Funcionario> funcionariosDepartamento = funcionarioRepositorio.findByDepartamentoNome(nomeDepartamentoConsulta4);
		System.out.println("Funcionários do departamento " + nomeDepartamentoConsulta4 + ":");

		for (Funcionario funcionario : funcionariosDepartamento) {
			System.out.println(funcionario);
		}

		System.out.print("Digite o nome do funcionário para ver seus departamentos: ");
		String nomeFuncionarioConsulta5 = sc.nextLine();
		List<Funcionario> funcionariosConsulta5 = funcionarioRepositorio.findByNome(nomeFuncionarioConsulta5);

		if (!funcionariosConsulta5.isEmpty()) {
			Funcionario funcionarioConsulta5 = funcionariosConsulta5.get(0);
			Departamento departamentoFuncionario = funcionarioConsulta5.getDepartamento();
			System.out.println("Departamentos do funcionário " + nomeFuncionarioConsulta5 + ":");
			System.out.println(departamentoFuncionario);
		} else {
			System.out.println("Nenhum funcionário encontrado com esse nome.");
		}

		
		System.out.print("Digite o nome do departamento para ver funcionários com salário maior que: ");
		String nomeDepartamentoConsulta = sc.nextLine();
		System.out.print("Digite o valor do salário: ");
		double salarioMinimoConsulta = sc.nextDouble();
		sc.nextLine();

		List<Funcionario> funcionariosConsulta6 = funcionarioRepositorio.findBySalarioAndDepartamento(salarioMinimoConsulta, nomeDepartamentoConsulta);
		System.out.println("Funcionários do departamento " + nomeDepartamentoConsulta + " com salário maior que " + salarioMinimoConsulta + ":");
		for (Funcionario funcionario : funcionariosConsulta6) {
			System.out.println(funcionario);
		}



		sc.close();
	}
}
