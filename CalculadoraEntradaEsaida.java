import java.util.Scanner;

public class CalculadoraEntradaEsaida {

	public static void main(String[] args) {
		
		Scanner calculadora = new Scanner(System.in);
		
		System.out.println("Digite um n�mero:");
		Double numero1 = calculadora.nextDouble();
		System.out.println("Digite um n�mero:");
		Double numero2 = calculadora.nextDouble();
		
		Double soma = soma(numero1, numero2); 
		System.out.println("Valor soma: "+  soma);
		
		Double sub = subtracao(numero1, numero2); 
		System.out.println("Valor subtra��o: "+  sub);
		
		Double mult = multiplicacao(numero1, numero2); 
		System.out.println("Valor multiplica��o: "+  mult);
		
		Double div = divisao(numero1, numero2); 
		System.out.println("Valor divis�o: "+  div);
		
		calculadora.close(); 

	}

	public static Double soma(Double n1, Double n2) {
		return n1 + n2;
	}
	
	public static Double subtracao(Double n1, Double n2) {
		return n1 - n2;
	}
	
	public static Double multiplicacao(Double n1, Double n2) {
		return n1 * n2;
	}
	
	public static Double divisao(Double n1, Double n2) {
		return n1 / n2;
	}
}
