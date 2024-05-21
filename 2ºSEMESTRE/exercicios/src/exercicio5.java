import java.util.Scanner;
public class exercicio5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int n = sc.nextInt();
		
		if (n<0){
			System.out.printf("NEGATIVO");					
		}else {
			System.out.printf("POSITIVO");
		}				
		sc.close();
	}
}
