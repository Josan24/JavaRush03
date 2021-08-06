package gui;

import modelo.Juego;
import utilidades.LecturaDatos;

public class PantallaMenus {
	
	public static int menuInicial() {
		int opcion = 0;

        System.out.print("**** Menú inicial ****\n" +
            "1) Gestion de juegos (altas)\n" +
            "2) Listado de juegos Genero:\"plataforma\"\n" +
            "3) Listado de juegos\n" +
            "4) Juegos para consolas de Nintendo\n" +
            "5) Listado de editores\n" +
            "6) Los juegos del siglo XX\n" +
            "7) Gestion de juegos (Edit, Delete)\n" +
            "8) Listados de juegos (filtrados por todo tipo de generos)\n" +
            "9) Los juegos que aparecen en anos pares\n" +
            "0) Salir\n\n");
        opcion = LecturaDatos.leerInteger("Seleciona una opcion: ");
           
        return opcion;
	}
	
	public static void menuGestionJuegos() {


        System.out.print("\n**** Men� Gestion de Juegos ****\n" +
            "1) Editar Juego\n" +
            "2) Eliminar Juego\n" +
            "0) Atras\n\n");

	}
	
	public static void menuEditarJuego() {
        System.out.print("**** Editar Juego ****\n" +
    		"1)Nombre\n" +
    		"2)Plataforma\n" +
    		"3)Año\n" +
    		"4)Genero\n" +
    		"5)Editor\n" +
            "0) Atrás\n");
        
	}
	public static void menuListaGeneros() {
        System.out.print("**** Generos Disponibles****\n" +
    		"1)Action\n" +
    		"2)Adventure\n" +
    		"3)Fighting\n" +
    		"4)Misc\n" +
    		"5)Platform\n" +
            "6) Puzzle\n" +
            "7)Racing\n" +
            "8)Role-Playing\n" +
            "9)Shooter\n" +
            "10)Simulation\n" +
            "11)Sports\n" +
            "12)Strategy\n" +
        	"0)atras\n");
        
	}

}
