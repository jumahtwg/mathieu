package modell;

public class Playfield {

	private int[][] gridSize;
	private Snake snake;
	
	
	public Playfield(int size) {
		setGridSize(size);
	}



	public void setSnakePosition(int x, int y) {
		this.gridSize[x][y] = 1;
		snake.setSnake(x, y);
	}



	public int[][] getGridSize() {
		return gridSize;
	}
	
	private void setGridSize(int size) {
		gridSize = new int[size][size];
		for (int i=0; i<size; i++) {
			for (int j=0; j<size; j++) {
				gridSize[i][j] = 0;
			}
		}
	}

	
	
	
}
