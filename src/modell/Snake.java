package modell;

public class Snake {

	private int snakeLength = 3;
	private int snakeHeadX;
	private int snakeHeadY;
	private int snakeMAXlength = 30;
	
	public void setSnake(int x, int y) {
		snakeHeadX = x;
		snakeHeadY = y;
	}
	
	public int getSnakeHeadX() {
		return snakeHeadX;
	}
	
	public int getSnakeHeadY() {
		return snakeHeadY;
	}
	
	public int getsnakeMAXlength() {
		return snakeMAXlength;
	}
	
	public int getsnakeLength() {
		return snakeLength;
	}
}
