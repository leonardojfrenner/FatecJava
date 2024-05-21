import java.util.Locale;
import java.util.Scanner;
public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Double area,pi,raio;
		pi = 3.14159;
		System.out.println("Digite um valor para o raio: ");
		raio = sc.nextDouble();		
		area = pi*Math.pow(raio, 2);
		System.out.printf("O valor da área é A = %.4f%n" , area);
		sc.close();
	}

}
