package mf0227.uf2404.actividad2;

public class Coche extends Vehiculo {

//atributos.
	private String marca;
	private String modelo;
	private int potencia;
	private int cilindrada;

//constructores.
	public Coche(String color, String matricula, String marca, String modelo, int potencia, int cilindrada) {
		super(color, matricula);
		this.marca = marca;
		this.modelo = modelo;
		this.potencia = potencia;
		this.cilindrada = cilindrada;
	}

	public Coche() {
		super();
		this.marca = "";
		this.modelo = "";
		this.potencia = 0;
		this.cilindrada = 0;
	}

//getters and setters
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;

	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", potencia=" + potencia + ", cilindrada=" + cilindrada
				+ "]";
	}

}
