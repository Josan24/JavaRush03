package control;

import Datos.Catalogo;
import utilidades.LecturaFichero;

public class Main {

	public static void main(String[] args) {

		Catalogo catalogo = new Catalogo(LecturaFichero.cargaInicial());

		Menu.controlMenu(catalogo);

	}

}
