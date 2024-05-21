import java.util.Locale;
import java.util.Scanner;

public class matrizes {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n, m, numeroRequisitado;
        
        System.out.print("Digite um numero para M(linha): ");
        n = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite um numero para N(colunas): ");
        m = sc.nextInt();
        sc.nextLine();

        int[][] matriz = new int[n][m];
        
        System.out.println("Digite os elementos da matriz:");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                matriz[i][j] = sc.nextInt();    
            }
        }
        sc.nextLine();
        
        System.out.print("Digite um numero para encontrar: ");
        numeroRequisitado = sc.nextInt();
        sc.nextLine();
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(numeroRequisitado == matriz[i][j]) {
                    System.out.println("Posição: " + i + "," + j);

                    if(j > 0) {
                        System.out.println("Esquerda: " + matriz[i][j - 1]);
                    }
                    if(i > 0) {
                        System.out.println("Cima: " + matriz[i - 1][j]);
                    }
                    if(j < m - 1) {
                        System.out.println("Direita: " + matriz[i][j + 1]);
                    }
                    if(i < n - 1) {
                        System.out.println("Baixo: " + matriz[i + 1][j]);
                    }
                }
            }
        }
        
        sc.close();
    }
}
