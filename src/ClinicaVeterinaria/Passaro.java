package ClinicaVeterinaria;

public class Passaro extends Animal {

	private static final long serialVersionUID = 1L;

	public String soar() {
		return "Pios";
	}
	public Passaro(String nome, int idade, String dono) {
		super(nome, idade, dono);
		this.especie 	= "Ave";
		this.alimento 	= "Alpiste e frutas.";
		this.cuidados 	= "Estimulos sonoros, abrigo.";
	}
}
