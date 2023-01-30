package org.lessons.java.shop;

import java.util.Scanner;

public class Catalogo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sceltaProdotto = 0;
		boolean sceltaSbagliata;
		
		System.out.println("Quanti prodotti vuoi inserire?");
		int numProdotti = Integer.parseInt(scan.nextLine());
		Prodotto[] prodotti = new Prodotto[numProdotti];
		
		for (int i = 0; i < prodotti.length; i++) {
			do {
				sceltaSbagliata = false;
				
				System.out.println("Scegliere il prodotto n."+(i+1)+" di "+prodotti.length+" da inserire nel catalogo");
				System.out.println("1 - Smartphone | 2 - Televisore | 3 - Cuffie");
				sceltaProdotto = Integer.parseInt(scan.nextLine());
				
				if (sceltaProdotto < 1 || sceltaProdotto > 3) {
					System.out.println("Scelta non corretta. Riprovare...");
					System.out.println();
					sceltaSbagliata = true;
				}
			} while (sceltaSbagliata);
			
			// Input Generici	
			System.out.println("Inserisci il Nome:");
			String nome = scan.nextLine();
			
			System.out.println("Inserisci la Marca:");
			String marca = scan.nextLine();
			
			System.out.println("Inserisci il Prezzo:");
			float prezzo = Float.parseFloat(scan.nextLine());
			
			// Input Specifici
			switch (sceltaProdotto) {
			// Smartphone
			case 1:
				System.out.println("Inserisci il Codice IMEI:");
				int codiceIMEI = Integer.parseInt(scan.nextLine());
				
				System.out.println("Inserisci la Quantità di Memoria:");
				int dimMemoria = Integer.parseInt(scan.nextLine());
				System.out.println();
				
				prodotti[i] = new Smartphone(nome, marca, prezzo, codiceIMEI, dimMemoria);
				break;
			// Televisore
			case 2:
				System.out.println("Inserisci le Dimensioni:");
				int dimSchermo = Integer.parseInt(scan.nextLine());
				int sceltaSmart;
				
				do {
					sceltaSbagliata = false;
					
					System.out.println("Indica se il dispositivo è Smart:");
					System.out.println("1 - SI | 2 - NO");
					sceltaSmart = Integer.parseInt(scan.nextLine());
					System.out.println();
					
					if (sceltaSmart < 1 || sceltaSmart > 2) {
						System.out.println("Scelta non corretta. Riprovare... \n");
						sceltaSbagliata = true;
						System.out.println();
					}
				} while (sceltaSbagliata);
				
				boolean isSmart = sceltaSmart == 1 ? true : false;
				
				prodotti[i] = new Televisore(nome, marca, prezzo, dimSchermo, isSmart);
				break;
			// Cuffie	
			case 3:
				System.out.println("Inserisci il Colore:");
				String colore = scan.nextLine();
				int sceltaWireless;
				
				do {
					sceltaSbagliata = false;
					
					System.out.println("Indica se il dispositivo è Wireless:");
					System.out.println("1 - SI | 2 - NO");
					sceltaWireless = Integer.parseInt(scan.nextLine());
					System.out.println();
					
					if (sceltaWireless < 1 || sceltaWireless > 2) {
						System.out.println("Scelta non corretta. Riprovare... \n");
						System.out.println();
						sceltaSbagliata = true;
					}
				} while (sceltaSbagliata);
				
				boolean isWireless = sceltaWireless == 1 ? true : false;
				
				prodotti[i] = new Cuffie(nome, marca, prezzo, colore, isWireless);
				break;
			}
		}
		
		System.out.println("Numero prodotti in catalogo: " + prodotti.length);
		System.out.println();
		for (int i = 0; i < prodotti.length; i++) {
			System.out.println(prodotti[i].toString());
			System.out.println();
		}
		
		scan.close();
	}

}