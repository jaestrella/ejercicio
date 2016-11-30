import java.util.Scanner;

public class TestMatematicas {
	
	public static void main (String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Introduce un numero para ver si es par:");
		int numero=sc.nextInt();
		System.out.println(Matematicas.esPar(numero));
	}
	/*public static boolean esPar(int numero){
		return numero%2==0;
	}*/
}

