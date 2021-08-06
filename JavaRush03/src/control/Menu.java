package control;

import java.util.ArrayList;

import Datos.Catalogo;
import gui.PantallaMenus;
import services.GestionCatalogo;

public class Menu {
	public static void controlMenu(Catalogo c) {
		GestionCatalogo gc2 = new GestionCatalogo();
		int option = 0;
		
		do {
			option = PantallaMenus.menuInicial();
			
			switch(option) {
			
			case 1:
				GestionCatalogo gc = new GestionCatalogo();			
				System.out.println("Añadir un nuevo juego");
				gc.agregarAlCatalogo(c);
				
				break;
			case 2:
				
				System.out.println("Listado de juegos Genero:\"plataforma\"");
				String genero = "Platform";
				gc2.generarInforme(new Catalogo(gc2.listaPorGenero(c, genero)));
				
				break;
			case 3:
				System.out.println("Listado de juegos");
				
				gc2.generarInforme(c);
				
				break;
			case 4:
				System.out.println("Juegos para consolas de Nintendo");
				gc2.generarInforme(new Catalogo(new GestionCatalogo().listaJuegosNintendo(c)));
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
