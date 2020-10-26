package com.ipartek.pojo;

/**
 * Una serie de TV consta de los siguientes atributos:
 * 
 * <ul>
 * <li>Nombre</li>
 * <li>numTemporadas</li>
 * <li>duracion (minutos)</li>
 * <li>plataforma(netflix,plex,hbo,moviestar,...)</li>
 * </ul>
 * 
 * El constructor debere pasarse siempre el nombre de forma obligatoria.. El
 * resto de campos se iniciaalzan a 0 y la plataforma especificar "internet"
 * 
 * @author Victor campos leal
 *
 */

public class Serie {
	// variables locales

	// atributos
	private int id;
	private String nombre;
	private int numTemporadas;
	private double minutos;
	private String plataforma;

	// constructor por defecto
	public Serie() {
		super();
		this.id = 0;
		this.nombre = "";
		this.numTemporadas = 0;
		this.minutos = 0;
		this.plataforma = "";

	}
	// getters y settres

	public String getNombre() {
		return nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumTemporadas() {
		return numTemporadas;
	}

	public void setNumTemporadas(int numTemporadas) {
		this.numTemporadas = numTemporadas;
	}

	public double getMinutos() {
		return minutos;
	}

	public void setMinutos(double minutos) {
		this.minutos = minutos;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

//to string para enviar la informacion
	@Override
	public String toString() {
		return "Serie [nombre=" + nombre + ", numTemporadas=" + numTemporadas + ", minutos=" + minutos
				+ ", plataforma=" + plataforma + "]";
	}

}
