package lissandramota.com.github.atividade.interfaces.classes;

import lissandramota.com.github.atividade.interfaces.interfaces.FiguraGeometricaInterface;

public class Retangulo implements FiguraGeometricaInterface {

	private Float base;
	private Float altura;
	private Float lado3;
	private Float lado4;
	

	public Retangulo(Float base, Float altura, Float lado3, Float lado4) {
		this.base = base;
		this.altura = altura;
		this.lado3 = lado3;
		this.lado4 = lado4;
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


	public Float getLado3() {
		return lado3;
	}


	public void setLado3(Float lado3) {
		this.lado3 = lado3;
	}


	public Float getLado4() {
		return lado4;
	}


	public void setLado4(Float lado4) {
		this.lado4 = lado4;
	}


	@Override
	public Float calcularArea() {
		return base * altura;
	}
	
	@Override
	public Float calcularPerimetro() {
		return base + altura + lado3 + lado4;
	}
	
	
}
