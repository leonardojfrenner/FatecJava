import java.util.Locale;
import java.util.Scanner;
public class exercicio4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int numero_funcionario;
		double horas_trabalhadas,valor_horas,salario;
		numero_funcionario = sc.nextInt();
		horas_trabalhadas = sc.nextDouble();
		valor_horas = sc.nextDouble();
		salario = valor_horas*horas_trabalhadas;
		
		System.out.printf("A matricula desse funcionario é Nº%d e seu salário é U$%.2f%n " , numero_funcionario,salario);
		
		
		
		
		
		sc.close();
	}

}
