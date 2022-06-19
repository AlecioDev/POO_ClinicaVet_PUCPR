package ClinicaVeterinaria;

public class Cao extends Animal {

	private static final long serialVersionUID = 1L;

	public String soar() {
		return "Latidos";
	}
	public Cao(String nome, int idade, String dono) {
		super(nome, idade, dono);
		this.especie 	= "Cachorro";
		this.alimento	= "Ração e carnes.";
		this.cuidados 	= "Tosa, banho, vacinas.";
	}
}
