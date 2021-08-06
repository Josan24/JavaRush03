package modelo;

/**
 * 
 * @author alumno
 *
 *La clase juego, el modelo de datos, incluye como atributos todas las columnas de datos que trae el csv.
 *
 */
public class Juego {

	int rank;
	String nombre;
	String plataforma;
	int ano;
	String genero;
	String editor;

	public Juego() {
		super();
	}

	public Juego(int rank, String nombre, String plataforma, int ano, String genero, String editor) {
		super();
		this.rank = rank;
		this.nombre = nombre;
		this.plataforma = plataforma;
		this.ano = ano;
		this.genero = genero;
		this.editor = editor;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

	@Override
	public String toString() {
		return "\n"
				+ "Juego " + rank + "\n"
				+ " nombre = " + nombre + "\n"
				+ " plataforma = " + plataforma + "\n"
				+ " año = " + ano 				+ "\n"
				+ " genero = " + genero + "\n"
				+ " editor = " + editor + "\n";
	}

}
