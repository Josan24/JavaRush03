package services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import Datos.Catalogo;
import gui.PantallaMenus;
import modelo.ConsolasNintendo;
import modelo.Generos;
import modelo.Juego;
import utilidades.LecturaDatos;

public class GestionCatalogo {

	public Juego nuevoJuego() {

		Juego j = new Juego();

		j.setRank(LecturaDatos.leerInteger("Introduce el ranking del juego"));
		j.setNombre(LecturaDatos.leerString("Introduce el nombre del juego"));
		j.setAno(LecturaDatos.leerInteger("Introduce el a�o del juego"));
		j.setEditor(LecturaDatos.leerString("Introduce el editor del juego"));
		j.setPlataforma(LecturaDatos.leerString("Introduce la plataforma del juego"));
		j.setGenero(LecturaDatos.leerString("Introduce el g�nero del juego"));

		return j;

	}

	public void agregarAlCatalogo(Catalogo c) {
		c.agregarJuego(nuevoJuego());
	}

	public ArrayList<Juego> listaPorGenero(Catalogo c, String genero) {

		ArrayList<Juego> filtrado = new ArrayList<Juego>();

		for (Juego juego : c.getCatalogo()) {
			if (juego.getGenero().equals(genero)) {
				// Anadimos el juego si tiene el mismo genero por el que filtramos

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

			System.out.println("No hay ning�n juego con ese Nombre. \n");

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

	public void editarJuego(Catalogo c) {

		Juego editar = buscarJuego(c);
		boolean encontrado = false;
		Juego juego = null;
		if (editar != null) {

			for (int i = 0; i < c.catalogo.size(); i++) {

				if (editar.getRank() == c.catalogo.get(i).getRank()) {

					juego = c.catalogo.get(i);
					System.out.println("Juego encontrado\n");
					encontrado = true;
				}
			}

		}

		if (encontrado) {

			int option = 0;

			do {
				PantallaMenus.menuEditarJuego();
				option = LecturaDatos.leerInteger("Seleciona una opcion: ");

				switch (option) {

				case 1:
					juego.setNombre(LecturaDatos.leerString("Nuevo nombre: "));

					break;
				case 2:

					juego.setPlataforma(LecturaDatos.leerString("Nueva plataforma: "));

					break;
				case 3:

					juego.setAno(LecturaDatos.leerInteger("Nuevo ano: "));

					break;
				case 4:

					juego.setGenero(LecturaDatos.leerString("Nuevo Genero: "));

					break;
				case 5:

					juego.setEditor(LecturaDatos.leerString("Nuevo Editor: "));

					break;
				case 0:

					option = 0;

				}

			} while (option != 0);
		} else {

			System.out.println("No hay ningun juego con ese Nombre. \n");
		}
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

	public void juegosAniosPares(Catalogo c) {

		Catalogo aniosPares = new Catalogo();
		aniosPares.catalogo = new ArrayList<Juego>();

		for (Juego juego : c.getCatalogo()) {

			if (juego.getAno() % 2 == 0) {

				aniosPares.catalogo.add(juego);
			}

		}

		aniosPares.imprimirCatalogo();
	}

	public void juegosSigloXX(Catalogo c) {

		Catalogo sigloXX = new Catalogo();
		sigloXX.catalogo = new ArrayList<Juego>();

		for (Juego juego : c.getCatalogo()) {

			if (juego.getAno() > 1899) {

				sigloXX.catalogo.add(juego);
			}

		}

		sigloXX.imprimirCatalogo();
	}
	
	public void juegosPorGeneros(Catalogo c) {
		int option = 0;
		
		do {
			PantallaMenus.menuListaGeneros();
			option = LecturaDatos.leerInteger("Seleciona una opcion: ");
	
			switch (option) {

				case 1:
					generarInforme(new Catalogo (listaPorGenero(c,Generos.ACTION.getGeneros())));
					break;
				case 2:
					generarInforme(new Catalogo (listaPorGenero(c,Generos.ADVENTURE.getGeneros())));
					break;
				case 3:
					generarInforme(new Catalogo (listaPorGenero(c,Generos.FIGHTING.getGeneros())));
					break;
				case 4:
					generarInforme(new Catalogo (listaPorGenero(c,Generos.MISC.getGeneros())));
					break;
				case 5:
					generarInforme(new Catalogo (listaPorGenero(c,Generos.PLATFORM.getGeneros())));
					break;
				case 6:
					generarInforme(new Catalogo (listaPorGenero(c,Generos.PUZZLE.getGeneros())));
					break;
				case 7:
					generarInforme(new Catalogo (listaPorGenero(c,Generos.RACING.getGeneros())));
					break;
				case 8:
					generarInforme(new Catalogo (listaPorGenero(c,Generos.ROLE.getGeneros())));
					break;
				case 9:
					generarInforme(new Catalogo (listaPorGenero(c,Generos.SHOOTER.getGeneros())));
					break;
				case 10:
					generarInforme(new Catalogo (listaPorGenero(c,Generos.SIMULATION.getGeneros())));
					break;
				case 11:
					generarInforme(new Catalogo (listaPorGenero(c,Generos.SPORTS.getGeneros())));
					break;
				case 12:
					generarInforme(new Catalogo (listaPorGenero(c,Generos.STRATEGY.getGeneros())));
					break;
				case 0:
	
					option = 0;
	
			}
		} while (option != 0);
	}

}
