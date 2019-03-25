package it.html.hibernate.bean;

public class Persona {
//Variabili di istanza
	private int id;
	private String nome;
	private String email;

//Costruttore pubblico
	public Persona() {
	}

	public String getEmail() {
		return email;
	}

//Metodi getter / setter
	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}