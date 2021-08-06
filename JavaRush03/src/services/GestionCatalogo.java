package services;

import Datos.Catalogo;
import modelo.Juego;
import utilidades.LecturaDatos;

/**
 * Clase para gestionar y hacer cambios en el catalogo.
 * El catalogo contiene todos los juegos cargados desde un CSV en un ArrayList
 * @author JavaRush
 *
 */
public class GestionCatalogo {

	/**
	 * Clase que crea un nuevo juego pidiendo al usuario los datos del juego por teclado
	 * @return Juego
	 */
	public Juego nuevoJuego() {

		Juego j = new Juego();

		j.setRank(LecturaDatos.leerInteger("Introduce el ranking del juego"));
		j.setNombre(LecturaDatos.leerString("Introduce el nombre del juego"));
		j.setAno(LecturaDatos.leerInteger("Introduce el año del juego"));
		j.setEditor(LecturaDatos.leerString("Introduce el editor del juego"));
		j.setPlataforma(LecturaDatos.leerString("Introduce la plataforma del juego"));
		j.setGenero(LecturaDatos.leerString("Introduce el género del juego"));

		return j;

	}

	/**
	 * Metodo que agrega un juego al ArrayList de un Catalogo
	 * @param Catalogo c
	 */
	public void agregarAlCatalogo(Catalogo c) {
		c.agregarJuego(nuevoJuego());
	}

}
