package com.ipartek.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.ipartek.pojo.Perro;

public class PerroDAOSqlite implements PerroDao {
	// hacemos una constante donde indicaremos la base de datos ala que se tiene que
	// conectar
	private static final String PATH = "ddbb/perrera.db";

	@Override
	public ArrayList<Perro> listar() {
		// hacemos el comando que mandaremos a SQLite en este caso que nos muestre todos
		// los perros de la base de datos
		final String SQL = "SELECT id, nombre,raza,peso FROM perro ORDER BY id DESC;";
		// declaramos el ArrayList del objeto o pojo tipo perro que es donde meteremos
		// los datos que saquemos de la ddbb
		ArrayList<Perro> perros = new ArrayList<Perro>();
		// hacemos la connection a la base de datos sqlite
		try (Connection conn = DriverManager.getConnection("jdbc:sqlite:" + PATH);
				PreparedStatement pst = conn.prepareStatement(SQL);
				ResultSet rs = pst.executeQuery();) {

			// recorremos el resultado que obtenemos de la base de datos
			while (rs.next()) {
				// creamos un nuevo Perro para meter los datos de la base de datos.despues lo
				// pintaremos
				Perro p = new Perro();
				// el id de la base de datos lo ponemos en el objeto que se acaba de crear en
				// Java
				p.setId(rs.getInt("id"));
				// el nombre de la base de datos lo ponemos en el objeto que se acaba de crear
				// en Java
				p.setNombre(rs.getString("nombre"));
				p.setRaza(rs.getString("raza"));
				p.setPeso(rs.getFloat("peso"));
				// we add the dog to the arrayList
				perros.add(p);

			} // terminamos el while
		} catch (Exception e) {

			e.printStackTrace();
		}
//regresamos perros que es el array List
		return perros;
	}

	@Override
	public Perro recuperar(int id) {
		Perro perro = null;
		final String SQL = "SELECT id, nombre,raza,peso,vacunado FROM perro WHERE id = ?;";

		try (Connection conn = DriverManager.getConnection("jdbc:sqlite:" + PATH);
				PreparedStatement pst = conn.prepareStatement(SQL);) {

			pst.setInt(1, id); // sustituimos el ? de la SQL por el parametro id

			try (ResultSet rs = pst.executeQuery()) {
				if (rs.next()) {
					perro = new Perro();
					perro.setId(rs.getInt("id"));
					perro.setNombre(rs.getString("nombre"));
					perro.setRaza(rs.getString("raza"));
					perro.setPeso(rs.getFloat("peso"));
					perro.setIsVacunado(rs.getBoolean("vacunado"));

				} // while
			} // 2º try

		} catch (Exception e) {
			e.printStackTrace();
		}
		return perro;
	}

	@Override
	public Perro crear(Perro p) throws Exception {
		Perro p1 = null;
		final String SQL = "INSERT INTO perro (nombre,raza,peso,vacunado) VALUES (?, ?,?,?);";
		try (Connection conn = DriverManager.getConnection("jdbc:sqlite:" + PATH);
				PreparedStatement pst = conn.prepareStatement(SQL, PreparedStatement.RETURN_GENERATED_KEYS);) {

			pst.setString(1, p.getNombre());
			pst.setString(2, p.getRaza());
			pst.setFloat(3, p.getPeso());
			pst.setBoolean(4, p.getIsVacunado());

			int affectedsRows = pst.executeUpdate();

			// recuperar el ultimo id generado
			if (affectedsRows == 1) {
				try (ResultSet rsKeys = pst.getGeneratedKeys()) {
					if (rsKeys.next()) {
						int id = rsKeys.getInt(1);
						p.setId(id);
					}
				}
			} // affectedsRows == 1// CUIDADO no usar executeQuery

		}

		return p1;
	}

	@Override
	public Perro modificar(Perro p) throws Exception {
		Perro perro = null;
		final String SQL = "UPDATE perro SET nombre = ? ,raza=?, peso = ?,vacunado=? WHERE id = ?;";
		try (Connection conn = DriverManager.getConnection("jdbc:sqlite:" + PATH);
				PreparedStatement pst = conn.prepareStatement(SQL);) {

			pst.setString(1, p.getNombre());
			pst.setString(2, p.getRaza());
			pst.setFloat(3, p.getPeso());
			pst.setBoolean(4, p.getIsVacunado());
			pst.setInt(5, p.getId());

			pst.executeUpdate(); // CUIDADO no usar executeQuery

		}

		return perro;
	}

	@Override
	public boolean eliminar(int id) throws Exception {
		boolean resul = false;
		final String SQL = "DELETE FROM perro WHERE id = ?;";
		try (Connection conn = DriverManager.getConnection("jdbc:sqlite:" + PATH);
				PreparedStatement pst = conn.prepareStatement(SQL);) {

			pst.setInt(1, id);

			if (1 == pst.executeUpdate()) {
				resul = true;
			}

		}
		return resul;
	}

	public int getLastId() {
		int resultado = 0;
		final String SQL = "SELECT id FROM perro ORDER BY id DESC LIMIT 1;";
		try (Connection conn = DriverManager.getConnection("jdbc:sqlite:" + PATH);
				PreparedStatement pst = conn.prepareStatement(SQL);
				ResultSet rs = pst.executeQuery();) {

			if (rs.next()) {
				resultado = rs.getInt("id");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return resultado;
	}

}
