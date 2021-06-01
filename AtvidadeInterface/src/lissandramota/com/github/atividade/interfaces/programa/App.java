package lissandramota.com.github.atividade.interfaces.programa;

import lissandramota.com.github.atividade.interfaces.classes.Circulo;
import lissandramota.com.github.atividade.interfaces.classes.Quadrado;
import lissandramota.com.github.atividade.interfaces.classes.Retangulo;
import lissandramota.com.github.atividade.interfaces.classes.Triangulo;
import lissandramota.com.github.atividade.interfaces.interfaces.FiguraGeometricaInterface;

public class App {

	public static void main(String[] args) {
		
		FiguraGeometricaInterface triangulo = new Triangulo(5f, 5.6f, 6f);
		System.out.println(triangulo.calcularArea());
		System.out.println(triangulo.calcularPerimetro());
		
		FiguraGeometricaInterface retangulo = new Retangulo(10f, 5f, 10f, 5f);
		System.out.println(retangulo.calcularArea());
		System.out.println(retangulo.calcularPerimetro());
		
		FiguraGeometricaInterface quadrado = new Quadrado(10f);
		System.out.println(quadrado.calcularArea());
		System.out.println(quadrado.calcularPerimetro());
		
		FiguraGeometricaInterface circulo = new Circulo(5f);
		System.out.println(circulo.calcularArea());
		System.out.println(circulo.calcularPerimetro());

	}

}
