package Voo;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando informações do voo ao usuário
        System.out.println("Digite o número do voo:");
        String numeroVoo = scanner.nextLine();

        System.out.println("Digite a cidade de origem:");
        String origem = scanner.nextLine();

        System.out.println("Digite a cidade de destino:");
        String destino = scanner.nextLine();

        System.out.println("Digite a quantidade de assentos disponíveis:");
        int assentosDisponiveis = scanner.nextInt();

        // Criando uma instância de Voo com as informações fornecidas pelo usuário
        Voo aviao = new Voo(numeroVoo, origem, destino, assentosDisponiveis);

        // Solicitando ao usuário a quantidade de assentos a reservar
        System.out.println("Digite a quantidade de assentos que deseja reservar:");
        int quantidadeAssentosReservados = scanner.nextInt();

        // Realizando uma reserva
        boolean reservaBemSucedida = aviao.realizarReserva(quantidadeAssentosReservados);

        if (reservaBemSucedida) {
            System.out.println("Reserva realizada com sucesso!");
        } else {
            System.out.println("Não há assentos disponíveis para a reserva.");
        }

        // Solicitando ao usuário informações para o pagamento
        System.out.println("Deseja ida e volta? (true/false):");
        boolean ida = scanner.nextBoolean();

        System.out.println("Deseja pontos turísticos? (true/false):");
        boolean pontosTuristicos = scanner.nextBoolean();

        // Efetuando o pagamento
        aviao.realizarPagamento(ida, !ida, pontosTuristicos);

        // Imprimindo a passagem
        aviao.imprimirPassagem();

        // Fechando o scanner
        scanner.close();
    }
}

