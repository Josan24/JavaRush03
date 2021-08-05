package services;

import modelo.Juego;
import utilidades.LecturaDatos;

public class GestionCatalogo {
	
	
	
	
	public Juego nuevoJuego() {
		
		Juego j = new Juego();
		
		
		j.setRank(LecturaDatos.leerInteger("Introduce el ranking del juego"));
		j.setNombre(LecturaDatos.leerString("Introduce el nombre del juego"));
		
		
		
		
		return j;
		
	}
	
	

}
