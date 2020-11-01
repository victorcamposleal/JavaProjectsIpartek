package com.ipartek.sqlite;

import com.ipartek.modelo.PerroDAOSqlite;
import com.ipartek.pojo.Perro;

public class Ejercicio2 {

	public static void main(String[] args) throws Exception {
		// Este DAO se encarga de realizara la operaciones de CRUD contra la bbdd
		PerroDAOSqlite dao = new PerroDAOSqlite();
		;

		// System.out.println(dao.recuperar(1));

		// Perro pNuevo = new Perro("scrappy dooesjjssss", "sabueso", 16, true);
		// try {
		// dao.crear(pNuevo); // insert
		// } catch (Exception e) {

		// e.printStackTrace();
		// System.out.printf("** el nombre del perro %s ya existe \n",
		// pNuevo.getNombre());
		// }
		Perro p = new Perro(7, "lolox", "golden retreiver", 12, true);
		dao.modificar(p);
		System.out.println("terminamos");

	}

}
