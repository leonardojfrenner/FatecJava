import java.util.Scanner;
public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b,c,d;
		System.out.println("Digite quatro valores: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		int diferenca = (a*b-c*d);
		System.out.println("A diferença de A e B pelo produto de C e D é: " + diferenca);
		sc.close();
	}

}
