package com.ipartek.modelo;

import java.util.ArrayList;

import com.ipartek.pojo.Perro;

public class PerroDAOArrayList implements PerroDao {

	private ArrayList<Perro> perros = new ArrayList<Perro>();

	@Override
	public ArrayList<Perro> listar() {
		// TODO Auto-generated method

		if (perros != null) {
			try {
				Perro p = new Perro();
				p.setEdad(15);
				p.setRaza("german shepard");
				p.setNombre("otto");
				p.setId(1);
				perros.add(p);

				p = new Perro();
				p.setEdad(15);
				p.setRaza("rottweiler");
				p.setNombre("Brutus");
				p.setId(2);
				perros.add(p);

				p = new Perro();
				p.setEdad(7);
				p.setRaza("Border Collie");
				p.setNombre("Lassie");
				p.setId(3);
				perros.add(p);

				p = new Perro();
				p.setEdad(7);
				p.setRaza("Border Collie");
				p.setNombre("pongo");
				p.setId(4);
				perros.add(p);

			}

			catch (Exception e) {

				System.out.println(e.getMessage());
			}

		}

		return perros;
	}

	@Override
	public Perro recuperar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Perro crear(Perro p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Perro modificar(Perro perro) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eliminar(int id) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

}
