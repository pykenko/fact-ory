package module;

public class Player {
	private int wood;
	private int stone;
	private int gold;
	private int money;
	
	public Player(int wood, int stone, int gold, int money) {
		super();
		this.wood = wood;
		this.stone = stone;
		this.gold = gold;
		this.money = money;
	}
	
	public int getWood() {
		return wood;
	}
	public void setWood(int wood) {
		this.wood = wood;
	}
	public int getStone() {
		return stone;
	}
	public void setStone(int stone) {
		this.stone = stone;
	}
	public int getGold() {
		return gold;
	}
	public void setGold(int gold) {
		this.gold = gold;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	
}
