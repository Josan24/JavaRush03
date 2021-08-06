package services;

import java.util.ArrayList;

import Datos.Catalogo;
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
	
	public ArrayList<Juego> listaPorGenero(Catalogo c, String genero){
		
		ArrayList<Juego> filtrado = new ArrayList<Juego>();
		
		for(Juego juego : c.getCatalogo()) {
			if(juego.getGenero().equals(genero)) {
				//Anadimos el juego si tiene el mismo genero por el que filtramos
				filtrado.add(juego);
			}
		}
		
		// Devolvemos la lista de juegos ya filtrados
		return filtrado;
	}
	
	

	
	public void generarInforme(Catalogo c) {
		c.imprimirCatalogo();
	}
}
