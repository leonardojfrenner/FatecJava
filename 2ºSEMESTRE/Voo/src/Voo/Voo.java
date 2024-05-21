package Voo;

public class Voo {
    String numeroVoo;
    String origem;
    String destino;
    int assentosDisponiveis;

    // Método construtor
    public Voo(String numeroVoo, String origem, String destino, int assentosDisponiveis) {
        this.numeroVoo = numeroVoo;
        this.origem = origem;
        this.destino = destino;
        this.assentosDisponiveis = assentosDisponiveis;
    }

    // Método para realizar a reserva de uma determinada quantidade de assentos
    public boolean realizarReserva(int quantidadeAssentos) {
        if (verificarDisponibilidade(quantidadeAssentos)) {
            assentosDisponiveis -= quantidadeAssentos;
            return true; // Reserva bem-sucedida
        }
        return false; // Reserva sem sucesso
    }

    // Método para verificar se há assentos disponíveis
    public boolean verificarDisponibilidade(int quantidadeAssentos) {
        return assentosDisponiveis >= quantidadeAssentos;
    }

    // Método para realizar o pagamento (exemplo simples)
    public void realizarPagamento(boolean ida, boolean volta, boolean pontosTuristicos) {
        double valorTotal = calcularValorTotal(ida, volta, pontosTuristicos);

        // Aqui você pode adicionar lógica para realizar o pagamento, como conexão com um sistema de pagamento, etc.
        // Por enquanto, apenas imprima uma mensagem indicando que o pagamento foi realizado.
        System.out.println("Pagamento realizado. Valor Total: $" + valorTotal);
    }

    // Método privado para calcular o valor total do pagamento
    private static double calcularValorTotal(boolean ida, boolean volta, boolean pontosTuristicos) {
        // Lógica de cálculo do valor total com base nas escolhas do cliente
        double valorBase = 100.0; // Valor base da passagem

        if (ida && volta) {
            valorBase *= 1.8; // Acréscimo para ida e volta
        }

        if (pontosTuristicos) {
            valorBase += 20.0; // Taxa adicional para pontos turísticos
        }

        return valorBase;
    }

    // Método para imprimir a passagem
    public void imprimirPassagem() {
        System.out.println("Passagem impressa para o voo " + numeroVoo);
        System.out.println("Origem: " + origem);
        System.out.println("Destino: " + destino);
        System.out.println("Assentos Disponíveis: " + assentosDisponiveis);
        // Adicione mais informações relevantes conforme necessário
    }
}
