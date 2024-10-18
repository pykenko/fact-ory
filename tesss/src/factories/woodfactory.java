package factories;

public class woodfactory extends Factory {
	private int perday;

	public woodfactory(String name, int total, int perday) {
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
