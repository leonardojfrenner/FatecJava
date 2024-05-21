import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos números voce vai digitar? ");
		int n = sc.nextInt();
		sc.nextLine();
		double[] vet = new double[n];
		double sum =0.0;
		double avg =0.0;
		
		for (int i = 0;i<vet.length;i++) {
			System.out.println("Digite um numero: ");
			vet[i] = sc.nextDouble();
		}
		System.out.print("VALORES = " );
		for (int i = 0;i<vet.length;i++) {
			System.out.printf("%.1f ", vet[i]);
		}
		for (int i = 0;i<vet.length;i++) {
			 sum += vet[i];
		}
		System.out.println("\nSoma: " + sum);
		avg = sum / vet.length;
		System.out.println("Media: "+ avg);
		
		sc.close();
	}

}
