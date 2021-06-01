package lissandramota.com.github.atividade.interfaces.classes;

import lissandramota.com.github.atividade.interfaces.interfaces.FiguraGeometricaInterface;

public class Triangulo implements FiguraGeometricaInterface{
	
	private Float base;
	private Float altura;
	private Float lado3 ;
	

	public Triangulo(Float base, Float altura, Float lado3) {
		this.base = base;
		this.altura = altura;
		this.lado3 = lado3;
	}


	public Float getLado3() {
		return lado3;
	}

	public void setLado2(Float lado2) {
		this.lado3 = lado2;
	}

	public Float getBase() {
		return base;
	}

	public void setBase(Float base) {
		this.base = base;
	}

	public Float getAltura() {
		return altura;
	}


	public void setAltura(Float altura) {
		this.altura = altura;
	}

	@Override
	public Float calcularArea() {
		return (base * altura)/2;
	}

	@Override
	public Float calcularPerimetro() {
		return base + altura + lado3;
	}

}
