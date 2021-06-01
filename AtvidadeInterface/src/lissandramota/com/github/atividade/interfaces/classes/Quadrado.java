package lissandramota.com.github.atividade.interfaces.classes;

import lissandramota.com.github.atividade.interfaces.interfaces.FiguraGeometricaInterface;

public class Quadrado implements FiguraGeometricaInterface{
	
	private Float lado;

	public Quadrado(Float lado) {
		this.lado = lado;
	}
	

	public Float getLado() {
		return lado;
	}

	public void setLado(Float lado) {
		this.lado = lado;
	}

	@Override
	public Float calcularArea() {
		return lado * lado;
	}

	@Override
	public Float calcularPerimetro() {
		return lado * 4;
	}

}
