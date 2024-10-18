package factories;

public class Factory {
	protected String name;
	protected int total;
	
	public Factory(String name, int total) {
		super();
		this.name = name;
		this.total = total;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
}
