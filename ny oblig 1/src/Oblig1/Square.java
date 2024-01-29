package Oblig1;

public class Square {

	private int index;
	private int newIndex;
	
	public Square(int index, int newIndex) {
		this.index = index;
		this.newIndex = newIndex;
	}
	
	public int update() {
		return newIndex;
	}
	public int gamleId() {
		return index;
	}
	
	public boolean stige() {
		return index<newIndex;
	}
	public boolean slange() {
		return index>newIndex;
	}
	
}
