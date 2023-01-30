package org.lessons.java.shop;

public class Smartphone extends Prodotto {
	private int codiceIMEI;
	private int dimMemoria;
	
	public Smartphone(String nome, String marca, float prezzo, int codiceIMEI, int dimMemoria) {
		super(nome, marca, prezzo);
		
		this.codiceIMEI = codiceIMEI;
		this.dimMemoria = dimMemoria;
	}

	public int getCodiceIMEI() {
		return codiceIMEI;
	}

	public void setCodiceIMEI(int codiceIMEI) {
		this.codiceIMEI = codiceIMEI;
	}

	public int getDimMemoria() {
		return dimMemoria;
	}

	public void setDimMemoria(int dimMemoria) {
		this.dimMemoria = dimMemoria;
	}
	
	public String toString() {
		return super.toString() + " | Codice IMEI: "+codiceIMEI+" | Grandezza Memoria: "+dimMemoria+"Gb";
	}
}
