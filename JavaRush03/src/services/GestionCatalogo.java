package services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import Datos.Catalogo;
import modelo.ConsolasNintendo;
import modelo.Juego;
import utilidades.LecturaDatos;

public class GestionCatalogo {

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

	public void agregarAlCatalogo(Catalogo c) {
		c.agregarJuego(nuevoJuego());
	}

	public ArrayList<Juego> listaPorGenero(Catalogo c, String genero) {

		ArrayList<Juego> filtrado = new ArrayList<Juego>();

		for (Juego juego : c.getCatalogo()) {
			if (juego.getGenero().equals(genero)) {
				// Añadimos el juego si tiene el mismo genero por el que filtramos
				filtrado.add(juego);
			}
		}

		// Devolvemos la lista de juegos ya filtrados
		return filtrado;
	}

	public void generarInforme(Catalogo c) {
		c.imprimirCatalogo();
	}

	public void eliminarJuego(Catalogo c) {
	
		Juego eliminar = buscarJuego(c);
		boolean encontrado = false;

		if (eliminar != null) {
			

			for (int i = 0; i < c.catalogo.size(); i++) {

				if (eliminar.getRank() == c.catalogo.get(i).getRank()) {

					c.catalogo.remove(i);
					encontrado = true;
				}

			}
		}
		if (encontrado) {

			System.out.println("Se ha eliminado el juego. \n");
		} else {

			System.out.println("No hay ningún juego con ese ID. \n");
		}
	}

	public ArrayList<Juego> listaJuegosNintendo(Catalogo c) {

		ArrayList<Juego> filtrado = new ArrayList<Juego>();

		for (Juego juego : c.getCatalogo()) {
			if (juego.getPlataforma().equals(ConsolasNintendo.WII.getConsolas())) {
				filtrado.add(juego);
			}
			if (juego.getPlataforma().equals(ConsolasNintendo.GB.getConsolas())) {
				filtrado.add(juego);
			}
			if (juego.getPlataforma().equals(ConsolasNintendo.NES.getConsolas())) {
				filtrado.add(juego);
			}
			if (juego.getPlataforma().equals(ConsolasNintendo.DS.getConsolas())) {
				filtrado.add(juego);
			}
			if (juego.getPlataforma().equals(ConsolasNintendo.SNES.getConsolas())) {
				filtrado.add(juego);
			}
			if (juego.getPlataforma().equals(ConsolasNintendo.GBA.getConsolas())) {
				filtrado.add(juego);
			}
			if (juego.getPlataforma().equals(ConsolasNintendo.TRESDS.getConsolas())) {
				filtrado.add(juego);
			}
			if (juego.getPlataforma().equals(ConsolasNintendo.N64.getConsolas())) {
				filtrado.add(juego);
			}
		}

		// Devolvemos la lista de juegos ya filtrados
		return filtrado;

	}

	public void listaEditores(Catalogo c) {
		// Inicializo un set de editores para no tener valores repetidos
		Set<String> editores = new HashSet<String>();

		for (Juego juego : c.getCatalogo()) {
			editores.add(juego.getEditor());
		}

		// Imprimimos la lista de editores
		System.out.println(editores);

	}

	public Juego buscarJuego(Catalogo c) {
		String nombre;
		do {
			nombre = LecturaDatos.leerString("Introduce titulo del juego: ");
		} while (nombre == null);

		Juego game = new Juego();
		boolean encontrado = false;
		// Busco el juego por el nombre
		for (Juego juego : c.getCatalogo()) {
			if (juego.getNombre().equals(nombre)) {
				game = juego;
				encontrado = true;
				break;
			}

		}

		if (encontrado == true) {
			return game;
		} else {
			game = null;
			return game;
		}
	}
}
