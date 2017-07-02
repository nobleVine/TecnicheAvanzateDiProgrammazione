package myproject;

public class Cestista {
<<<<<<< HEAD
	
	private int altezza;
	private String squadra;
	public String getSquadra() {
		return squadra;
	}
	public void setSquadra(String squadra) {
		this.squadra = squadra;
	}
	private int numScarpe;
	private int salario;
	
	public int getNumScarpe() {
		return numScarpe;
	}
	public void setNumScarpe(int numScarpe) {
		this.numScarpe = numScarpe;
	}
	private int eta;
	
	public int getAltezza() {
		return altezza;
	}
	public void setAltezza(int altezza) {
		this.altezza = altezza;
	}
	
	

}
=======

	private String nome;
	private String squadra;
	private boolean freeAgency = true;
	private int aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa = 0;

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
	 * @param squadra
	 *            the squadra to set
	 */
	public void setSquadra(String squadra) {
		this.squadra = squadra;
	}

	public void stampaCoro() {
		System.out.println("LET'S GO");
	}

	/**
	 * @return the freeAgency
	 */
	public boolean isFreeAgency() {
		return freeAgency;
	}

	/**
	 * @param freeAgency
	 *            the freeAgency to set
	 */
	public void setFreeAgency(boolean freeAgency) {
		this.freeAgency = freeAgency;
	}

	public void getLebron() {
		System.out.println("I'am only king");
	}

}
>>>>>>> refs/remotes/origin/master
