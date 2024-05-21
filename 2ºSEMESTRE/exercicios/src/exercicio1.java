import java.util.Scanner;
public class exercicio1 {

	public static void main(String[] args) {
		
		System.out.println("Digite dois valores: ");
		Scanner sc = new Scanner(System.in);
		int x,y,soma;
		x = sc.nextInt();
		y = sc.nextInt();
		soma = x + y;
		System.out.println("A soma dos valores é: " + soma);
		
		
		sc.close();
		}

}
