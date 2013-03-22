package modell;

public class Playfield {

	private int[][] gridSize;

	
	
	public Playfield(int size) {
		for (int i=0; i<size; i++) {
			for (int j=0; j<size; j++) {
				gridSize[i][j] = 0;
			}
		}
	}



	public int[][] getGridSize() {
		return gridSize;
	}
	

	
	
	
}
