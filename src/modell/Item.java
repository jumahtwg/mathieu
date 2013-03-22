package modell;

public class Item {

	private int itemX;
	private int itemY;
	private String itemType;
	
	public void setItem(String type, int x, int y) {
		itemX = x;
		itemY = y;
		itemType = type;
	}

	public String getItemType() {
		return itemType;
	}

	public int getItemX() {
		return itemX;
	}

	public int getItemY() {
		return itemY;
	}
	

}
