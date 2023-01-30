package org.lessons.java.shop;

public class Televisore extends Prodotto {
	private int dimSchermo;
	private boolean isSmart;
	
	public Televisore(String nome, String marca, float prezzo, int dimSchermo, boolean isSmart) {
		super(nome, marca, prezzo);
		
		this.dimSchermo = dimSchermo;
		this.isSmart = isSmart;
	}

	public int getDimSchermo() {
		return dimSchermo;
	}

	public void setDimSchermo(int dimSchermo) {
		this.dimSchermo = dimSchermo;
	}

	public boolean isSmart() {
		return isSmart;
	}

	public void setIsSmart(boolean isSmart) {
		this.isSmart = isSmart;
	}

}
