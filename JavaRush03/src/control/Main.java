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
		

		int option = 0;
		
		do {
			option = Menus.menuInicial();
			
			switch(option) {
			
			case 1:
				System.out.println("Estamos trabajando en ello");
				break;
			case 2:
				
				System.out.println("Listado de todos los juegos");
				c.imprimirCatalogo();
				
				break;
			case 3:
				System.out.println("Listado de juegos");
				break;
			case 4:
				System.out.println("Juegos para consolas de Nintendo");
				break;
			case 5:
				System.out.println("Listado de editores");
				break;
			case 6:
				System.out.println("Los juegos del siglo XX");
				break;
			case 7:
				System.out.println("Gestión de juegos (Edit, Delete)");
				//Buscar juego
				//llamar menuEditarjuego(juego);
				
				break;
			case 8:
				System.out.println("Listados de juegos (filtrados por todo tipo de géneros)");
				break;
			case 9:
				System.out.println("Los juegos que aparecen en años pares");
				break;
			case 0:
				System.out.println("Salir");
				break;
			}
			
		}while(option != 0);
		
		
		
		
	}

}
