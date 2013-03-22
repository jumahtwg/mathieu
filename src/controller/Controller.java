package controller;

import java.util.Scanner;

import modell.Playfield;
import modell.Snake;

public class Controller {
	
	public Controller() {
		int i = getGridSize();
		Playfield playfld = new Playfield(i);
		Snake snake = new Snake();
		
	}
	
	private int getGridSize() {
		System.out.println("Bitte Feldlaenge eingeben:");
		return new Scanner(System.in).nextInt();
	}
}
