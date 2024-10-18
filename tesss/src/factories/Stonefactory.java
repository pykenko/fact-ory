package factories;

public class Stonefactory extends Factory {
	private int perday;

	public Stonefactory(String name, int total, int perday) {
		super(name, total);
		this.perday = perday;
	}
	
	public int getPerday() {
		return perday;
	}

	public void setPerday(int perday) {
		this.perday = perday;
	}
}
