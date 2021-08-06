package modelo;

public enum Generos {
	ACTION("Action"), ADVENTURE("Adventure"), FIGHTING("Fighting"), MISC("Misc"), PLATFORM("Platform"),PUZZLE("Puzzle"), RACING("Racing"), ROLE("Role-Playing"), SHOOTER("Shooter"), SIMULATION("Simulation"), SPORTS("Sports"), STRATEGY("Strategy");
		
	private final String generos;

	private Generos(String generos) {
		this.generos = generos;
	}

	public String getGeneros() {
		return generos;
	}
		
}