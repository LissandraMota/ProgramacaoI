package lissandramota.com.github.atividade.interfaces.classes;

import lissandramota.com.github.atividade.interfaces.interfaces.FiguraGeometricaInterface;

public class Circulo implements FiguraGeometricaInterface{
	
	private Float pi;
	private Float raioCirculo;
	
	public Circulo(Float raioCirculo) {
		this.pi = 3.14f;
		this.raioCirculo = raioCirculo;
	}
	
	public Float getPi() {
		return pi;
	}

	public void setPi(Float pi) {
		this.pi = pi;
	}

	public Float getRaioCirculo() {
		return raioCirculo;
	}


	public void setRaioCirculo(Float raioCirculo) {
		this.raioCirculo = raioCirculo;
	}


	@Override
	public Float calcularArea() {
		return (float) (pi * Math.pow(raioCirculo, 2f));
	}
	
	@Override
	public Float calcularPerimetro() {
		return 2 * (float) (pi * Math.pow(raioCirculo, 2f));
	}
	
	
	
	

}
