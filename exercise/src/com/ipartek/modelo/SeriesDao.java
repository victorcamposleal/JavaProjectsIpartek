package com.ipartek.modelo;

import java.util.ArrayList;

import com.ipartek.pojo.Serie;

/**
 * Para definir las operaciones de CRUD
 * 
 * @author HP
 *
 */
interface SeriesDao {

	/**
	 * 
	 * @return todos los perros
	 */
	ArrayList<Serie> listar();

	/**
	 * 
	 * @param id identificador del perro
	 * @return perro con sus datos o null si no encuentra al perro
	 */

	Serie recuperar(int id);

	/**
	 * crea un nuevo perro y cuando es guardado se le asigna una nueva id
	 * 
	 * @param p Perro con los datos a guardad
	 * @Throws Exception si el nombre del peerro ya existe
	 * @return perro con su id actualizados
	 * 
	 */

	Serie crear(Serie s);

	/**
	 * modifica un perro
	 * 
	 * @param perro con los datos nuevos
	 * @return perro modificad
	 * @throws si un nombre existe
	 */

	Serie modificar(Serie serie) throws Exception;;

	/*
	 * @param id
	 * 
	 * @return true si elimina false en caso contrario
	 */
	boolean eliminar(int id) throws Exception;

}
