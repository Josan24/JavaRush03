package control;

import java.util.ArrayList;

import Datos.Catalogo;
import gui.Menus;
import modelo.Juego;
import utilidades.LecturaFichero;

public class Main {

	public static void main(String[] args) {

		Catalogo catalogo = new Catalogo(LecturaFichero.cargaInicial());
		/* new Test().Test01(); */ 

		opcionesMenuPrincipal(catalogo);
		


	}
	
	public static void opcionesMenuPrincipal(Catalogo c) {
		

		int option = Menus.menuInicial();
		
		switch(option) {
		
		case 1:
			System.out.println("Estamos trabajando en ello");
			break;
		case 2:
			
			System.out.println("Listado de todos los juegos");
			c.imprimirCatalogo();
			
			break;
		
		
		}
		
		
		
	}
	

}
