import java.util.Scanner;

public class QuantidadeSegundos {
	public static void main (String[] args) {
	Scanner leitor = new Scanner (System.in);
	double horas = 0;		
	double minutos = 0;
	double segundos = 0;
	double qtdTotalSegundos = 0;
	
	System.out.print("Digite as horas: ");
	horas = leitor.nextDouble();
	System.out.print("Digite os minutos: ");
	minutos = leitor.nextDouble();
	System.out.print("Digite os segundos: ");
	segundos = leitor.nextDouble();
	
	leitor.close();
	
	qtdTotalSegundos = ((segundos) + 
			(60 * minutos) +
			(3600 * horas));
	
	System.out.println("Total de segundos: " + qtdTotalSegundos);
	
	}
}