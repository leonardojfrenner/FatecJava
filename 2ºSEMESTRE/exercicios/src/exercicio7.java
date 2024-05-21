import java.util.Scanner;
public class exercicio7 {

	public static void main(String[] args) {
		//([0,25], (25,50], (50,75], (75,100])
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor:");
		double vl1;
		vl1= sc.nextDouble();
		
		if(vl1>=0 && vl1<=25) {
			System.out.println("INTERVALOR [0,25]");
		} else if(vl1>=25 && vl1<=50) {
			System.out.println("INTERVALOR [25,50]");
		}else if(vl1>=50 && vl1<=75) {
			System.out.println("INTERVALOR [50,75]");
		}else if(vl1>=75 && vl1<=100) {
			System.out.println("INTERVALOR [75,100]");
		}else {
			System.out.println("FORA DE INTERVALO");
		}
		
		
		
		
		sc.close();
	}

}
