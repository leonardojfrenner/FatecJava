import java.util.Locale;
import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos numeros vc vai digitar? ");
		
		int n = sc.nextInt();
		sc.nextLine();
		int[] vetor = new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Digite um número: ");
			vetor[i] = sc.nextInt();
		}
		for (int i =0;i<n;i++ ) {
			if(vetor[i] < 0) {
				System.out.println("NÚMEROS NEGATIVOS: " + vetor[i]);
			}
		}
		
		sc.close();
	}

}
