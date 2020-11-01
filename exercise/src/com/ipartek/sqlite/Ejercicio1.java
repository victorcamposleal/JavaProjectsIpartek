package com.ipartek.sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ejercicio1 {

	public static void main(String[] args) throws SQLException {
		// se establce la connexion
		Connection conn = DriverManager.getConnection("jdbc:sqlite:ddbb/series.db");
//hacemos el  satment a mandar a la sql
		String sql = "SELECT * FROM serietv;";
		PreparedStatement pst = conn.prepareStatement(sql);
		ResultSet rs = pst.executeQuery();
//se recorren los resultados
		while (rs.next()) {
			System.out.printf(" %s la serie %s se da en la plataforma %s  %n", rs.getInt("id"), rs.getString("nombre"),
					rs.getString("platforma"));

		}

		System.out.println("terminamos");

	}
}
