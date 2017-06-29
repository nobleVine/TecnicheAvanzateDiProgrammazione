package myproject;

public class Cestista {

	private String nome;
	private String squadra;
	private boolean freeAgency = true;
	
	public Cestista(String n, String s) {
		nome = n;
		squadra = s;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome
	 *            the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the squadra
	 */
	public String getSquadra() {
		return squadra;
	}

	/**
	 * @param squadra the squadra to set
	 */
	public void setSquadra(String squadra) {
		this.squadra = squadra;
	}
	
	public void stampaCoro(){
		System.out.println("LET'S GO");
	}

}