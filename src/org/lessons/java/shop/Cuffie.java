package org.lessons.java.shop;

public class Cuffie extends Prodotto {
	String colore;
	boolean isWireless;
	
	public Cuffie(String nome, String marca, float prezzo, String colore, boolean isWireless) {
		super(nome, marca, prezzo);
		
		this.colore = colore;
		this.isWireless = isWireless;
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public boolean isWireless() {
		return isWireless;
	}

	public void setIsWireless(boolean isWireless) {
		this.isWireless = isWireless;
	}
	
	public String toString() {
		return super.toString() + " | Colore: "+colore+" | Tecnologia Wireless: "+(isWireless?"SI":"NO");
	}
}