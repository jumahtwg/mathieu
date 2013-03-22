package controller;

import java.util.Random;
import java.util.Scanner;

import modell.Item;
import modell.Playfield;

public class Controller {
	
	int gridSize;
	Playfield playfld;
	Item item;
	private Scanner scanner;
	private GAME_STATE status;
	public enum GAME_STATE { TURN_LEFT, TURN_RIGHT, TURN_DOWN, TURN_UP }
	
	public Controller() {
		gridSize = getGridSize();
		playfld = new Playfield(gridSize);
		startGame();
		
	}
	
	private int getGridSize() {
		System.out.println("Bitte Feldlaenge eingeben:");
		scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
	
	private void startGame() {
		int startPointX = gridSize/2;
		int startPointY = gridSize/2;
		playfld.setSnakePosition(startPointX, startPointY);
		status = GAME_STATE.TURN_RIGHT;
		
		
	}
}
