import java.util.Scanner;
public class exercicio6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int n = sc.nextInt();
		
		if (n %2 == 0){
			System.out.printf("PAR");					
		}else {
			System.out.printf("IMPAR");
		}				
		sc.close();
	}
}
