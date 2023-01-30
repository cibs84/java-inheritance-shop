package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
	private int codice;
	private String nome;
	private String marca;
	private float prezzo;
	private float iva = 22;
	
	public Prodotto(String nome, String marca, float prezzo) {
		this.nome = nome;
		this.marca = marca;
		this.prezzo = prezzo;
		
		Random rand = new Random();
		this.codice = rand.nextInt(100000000);
	}
	
	public int getCodice() {
		return codice;
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}

	public float getIva() {
		return iva;
	}

	public void setIva(float iva) {
		this.iva = iva;
	}

	public String getPrezzoIvato() {
		return "€ " + this.prezzo * ( this.iva/100 + 1 ) + "iva incl.";
	}
	
	public String getNomeCompletoProdotto() {
		return this.getCodicePad() + "-" + this.nome;
	}
	
	public String getCodicePad() {
		return String.format("%08d", this.codice);
	}
}
