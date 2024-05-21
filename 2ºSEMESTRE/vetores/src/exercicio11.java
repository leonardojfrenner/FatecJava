import java.util.Locale;
import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double menorAltura,maiorAltura;
		double mediaAltura,
			   somaAltura=0.0;
		int qtMulher=0,
			qtHomem=0;
		
		
		System.out.println("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		sc.nextLine();
		double[] altura = new double[n];
		char[] genero= new char[n];
		
		
		for(int i = 0;i<altura.length;i++) {
			System.out.print("Altura da "+(i+1)+"ª pessoa: " );
			altura[i]=sc.nextDouble();
			sc.nextLine();
			System.out.print("Genero da da "+(i+1)+"ª pessoa: ");
			genero[i] = sc.next().charAt(0);
			
			
		}	
		
		menorAltura=altura[0];
		maiorAltura=altura[0];
		
		for(int i = 0;i<altura.length;i++) {
			if(altura[i]<menorAltura) {
				menorAltura = altura[i];
			}
			if(altura[i]>maiorAltura) {
				maiorAltura = altura[i];		
			}
			if(genero[i] == 'f' || genero[i] == 'F') {
				somaAltura += altura[i];
				qtMulher++;
			} else{
				qtHomem++;
			}
			
		}
		
		mediaAltura = somaAltura/qtMulher;
		
		System.out.println("Menor ALtura: " + menorAltura);
		System.out.println("Maior Altura: " + maiorAltura);
		System.out.printf( "Media das alturas das mulheres: %.2f " , mediaAltura);
		System.out.println("\nNumero de homens:" + qtHomem);
		
		sc.close();
	}

}
