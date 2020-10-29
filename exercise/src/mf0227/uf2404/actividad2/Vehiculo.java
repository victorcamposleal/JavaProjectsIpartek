package mf0227.uf2404.actividad2;

/**
 * Crear clase Vehiculo ( color, matricula ) esta es la clase padre que se
 * implementara en el hijo vehiculo
 * 
 * @author Victor Campos Leal
 *
 */
public class Vehiculo implements IConducible {

	// atributos
	private String color;
	private String matricula;

	// Constructorres

	public Vehiculo(String color, String matricula) {
		super();
		this.color = color;
		this.matricula = matricula;
	}

	public Vehiculo() {
		super();
		this.color = "";
		this.matricula = "";
	}

	// getters and settters

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	// Metodo To string

	@Override
	public String toString() {
		return "Vehiculo [color=" + color + ", matricula=" + matricula + "]";
	}

	@Override
	public void arrancar() {
		System.out.println("el Coche esta arrancado. Run Run");

	}

	@Override
	public void parar() {
		System.out.println("el Coche esta parado. ----------------");

	}

}
