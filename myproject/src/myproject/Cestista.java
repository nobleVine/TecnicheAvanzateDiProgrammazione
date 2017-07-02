package myproject;

public class Cestista {

	private String nome;
	private String squadra;
	private boolean freeAgency = true;
	private int aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa = 0;

	public Cestista(String n, String s) {
		nome = n;
		squadra = s;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSquadra() {
		return squadra;
	}

	public void setSquadra(String squadra) {
		this.squadra = squadra;
	}

	public void stampaCoro() {
		System.out.println("LET'S GO");
	}

	public boolean isFreeAgency() {
		return freeAgency;
	}

	public void setFreeAgency(boolean freeAgency) {
		this.freeAgency = freeAgency;
	}

	public void getLebron() {
		System.out.println("I'am only king");
	}
	
	

}