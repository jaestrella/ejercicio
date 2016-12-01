import java.util.Scanner;

public class TestMatematicas {
	
	public static void main (String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Introduce un numero para ver si es par:");
		int numero=sc.nextInt();
		System.out.printf("El numero %d es par: %b%n",numero,Matematicas.esPar(numero));
		System.out.printf("El numero %d es divisible por 3: %b%n",numero,Matematicas.esDivisiblePorTres(numero));
		System.out.printf("El numero %d es divisible por 5: %b%n",numero,Matematicas.esDivisblePorCinco(numero));
	}
	/*public static boolean esPar(int numero){
		return numero%2==0;
	}*/
}

