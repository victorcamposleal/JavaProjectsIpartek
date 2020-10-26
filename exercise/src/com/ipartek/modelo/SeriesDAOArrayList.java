package com.ipartek.modelo;

import java.util.ArrayList;
import java.util.Scanner;

import com.ipartek.pojo.Serie;

public class SeriesDAOArrayList implements SeriesDao {

	private ArrayList<Serie> series = new ArrayList<Serie>();
	static private Scanner sc = null;

	@Override
	public ArrayList<Serie> listar() {
		if (series != null) {
			Serie s = new Serie();
			s.setId(1);
			s.setNombre("Rick & Morty");
			s.setMinutos(30);
			s.setNumTemporadas(6);
			s.setPlataforma("Hulu");
			series.add(s);
			s = new Serie();
			s.setId(2);
			s.setNombre("Silicon Valley");
			s.setMinutos(50);
			s.setNumTemporadas(8);
			s.setPlataforma("HBO");
			series.add(s);
			s = new Serie();
			s.setId(3);
			s.setNombre("Entourage");
			s.setMinutos(50);
			s.setNumTemporadas(9);
			s.setPlataforma("HBO");
			series.add(s);
			s = new Serie();
			s.setId(4);
			s.setNombre("BroadWalk Empire");
			s.setMinutos(59);
			s.setNumTemporadas(7);
			s.setPlataforma("HBO");
			series.add(s);
			s = new Serie();
			s.setId(5);
			s.setNombre("Mandalorian");
			s.setMinutos(40);
			s.setNumTemporadas(2);
			s.setPlataforma("Disney");
			series.add(s);
		}
		return series;
	}

	@Override
	public Serie recuperar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Serie crear(Serie s) {
		// TODO Auto-generated method stub
		int id = series.size() + 1;
		sc = new Scanner(System.in);
		Serie sn = new Serie();
		sn.setId(id);
		System.out.println("Inserta el nuevo nombre");
		sn.setNombre(sc.nextLine());
		System.out.println("Inserta el numero de temporadas");
		sn.setNumTemporadas(Integer.parseInt(sc.nextLine()));
		System.out.println("Inserta el nombre de la pltaforma");
		sn.setPlataforma(sc.nextLine());
		System.out.println("Inserta la duracion de minutos por capitulo");
		sn.setMinutos(Integer.parseInt(sc.nextLine()));

		series.add(sn);

		return sn;
	}

	@Override
	public Serie modificar(Serie serie) throws Exception {

		return null;
	}

	@Override
	public boolean eliminar(int id) throws Exception {
		for (Serie serie : series) {
			if (serie.getId() == id) {
				series.remove(serie);
				break;
			}
		}

		return true;
	}

}
