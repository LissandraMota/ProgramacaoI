import java.util.Scanner;

public class CalculadoraEntradaEsaida {

	public static void main(String[] args) {
		
		Scanner calculadora = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		Double numero1 = calculadora.nextDouble();
		System.out.println("Digite um número:");
		Double numero2 = calculadora.nextDouble();
		
		Double soma = soma(numero1, numero2); 
		System.out.println("Valor soma: "+  soma);
		
		Double sub = subtracao(numero1, numero2); 
		System.out.println("Valor subtração: "+  sub);
		
		Double mult = multiplicacao(numero1, numero2); 
		System.out.println("Valor multiplicação: "+  mult);
		
		Double div = divisao(numero1, numero2); 
		System.out.println("Valor divisão: "+  div);
		
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
