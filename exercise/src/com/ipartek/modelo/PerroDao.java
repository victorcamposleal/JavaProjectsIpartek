package com.ipartek.modelo;

import java.util.ArrayList;

import com.ipartek.pojo.Perro;

/**
 * Para definir las operaciones de CRUD
 * 
 * @author HP
 *
 */
public interface PerroDao {
	/**
	 * 
	 * @return todos los perros
	 */
	ArrayList<Perro> listar();

	/**
	 * 
	 * @param id identificador del perro
	 * @return perro con sus datos o null si no encuentra al perro
	 */

	Perro recuperar(int id);

	/**
	 * crea un nuevo perro y cuando es guardado se le asigna una nueva id
	 * 
	 * @param p Perro con los datos a guardad
	 * @Throws Exception si el nombre del peerro ya existe
	 * @return perro con su id actualizados
	 * 
	 */

	Perro crear(Perro p);

	/**
	 * modifica un perro
	 * 
	 * @param perro con los datos nuevos
	 * @return perro modificad
	 * @throws si un nombre existe
	 */

	Perro modificar(Perro perro) throws Exception;;

	/*
	 * @param id
	 * 
	 * @return true si elimina false en caso contrario
	 */
	boolean eliminar(int id) throws Exception;

}
