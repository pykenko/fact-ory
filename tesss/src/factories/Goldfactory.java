package factories;

public class Goldfactory extends Factory {
	public int perday;

	public Goldfactory(String name, int total, int perday) {
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
