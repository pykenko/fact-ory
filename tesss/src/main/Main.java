package main;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import factories.Factory;
import factories.Goldfactory;
import factories.Stonefactory;
import factories.woodfactory;
import module.Player;

public class Main {
	
	ArrayList<String> punyauser = new ArrayList<>();
	
	Scanner sc = new Scanner(System.in);
	public Player user = new Player(40, 40, 40, 0);
	Factory gold1 = new Goldfactory("PT tambang emas", 0, 10);
	Factory stone1 = new Stonefactory("PT keras kepala", 0, 10);
	Factory wood1 = new woodfactory("pt oud fragrance", 0, 10);
	int current_day = 0;
	
	public void daytime() {
		current_day++;
		int wood = user.getWood();
		int gold = user.getGold();
		int stone = user.getStone();
		int money = user.getMoney();
		int hasilgold = ((Goldfactory) gold1).getPerday() * ((Goldfactory)gold1).getTotal();
		int hasilstone = ((Stonefactory)stone1).getPerday() * ((Stonefactory)stone1).getTotal();
 		int hasilwood = ((woodfactory)wood1).getPerday() * ((woodfactory)wood1).getTotal();
 		user.setWood(hasilwood + wood);
 		user.setStone(hasilstone + stone);
 		user.setGold(hasilgold + gold);
 		return;
	}
	
	public void buyfactory() {
		while(true) {			
			util.cls();
			System.out.println("=".repeat(30));
			System.out.printf("Wood : %d\n", user.getWood());
			System.out.printf("Stone : %d\n", user.getStone());
			System.out.printf("Gold : %d\n", user.getGold());
			System.out.printf("Money : %d\n", user.getMoney());
			System.out.println("=".repeat(30));
			System.out.println();
			System.out.println("buy factory");
			System.out.println("=".repeat(30));
			System.out.printf("1 | %15s|\n", "Wood factory");
			System.out.printf("2 | %15s|\n", "Stone factory");
			System.out.printf("3 | %15s|\n", "Gold factory");
			System.out.println("=".repeat(30));
			System.out.println("to buy any type of factory you need: 10 wood, 10 stone and 10 gold.");
			System.out.println();
			System.out.print("choose factory [1-3], [0] to go back : ");
			int choice = sc.nextInt();
			sc.nextLine();
			int currgold = user.getGold();
			int currstone = user.getStone();
			int currwood = user.getWood();
			int currtotalwood = wood1.getTotal();
			int currtotalstone = stone1.getTotal();
			int currtotalgold = gold1.getTotal();
			if(choice == 0)break;
			if(choice == 1) {
				if(user.getGold() > 9 && user.getStone() > 9 && user.getWood() > 9) {
					user.setGold(currgold - 10);
					user.setStone(currstone - 10);
					user.setWood(currwood - 10);
					wood1.setTotal(currtotalwood + 1);
					punyauser.add(wood1.getName());
				} else {
					System.out.println("you dont have enough money!");
					System.out.println("press any key to continue");
					sc.nextLine();
				}
			} else if (choice == 2) {
				if(user.getGold() > 9 && user.getStone() > 9 && user.getWood() > 9) {
					user.setGold(currgold - 10);
					user.setStone(currstone - 10);
					user.setWood(currwood - 10);
					stone1.setTotal(currtotalstone + 1);
					punyauser.add(stone1.getName());
				} else {
					System.out.println("you dont have enough money!");
					System.out.println("press any key to continue");
					sc.nextLine();
				}
			} else if (choice == 3) {
				if(user.getGold() > 9 && user.getStone() > 9 && user.getWood() > 9) {
					user.setGold(currgold - 10);
					user.setStone(currstone - 10);
					user.setWood(currwood - 10);
					gold1.setTotal(currtotalgold + 1);
					punyauser.add(gold1.getName());
				} else {
					System.out.println("you dont have enough money!");
					System.out.println("press any key to continue");
					sc.nextLine();
				}
			}
		}
		gameloop();
	}
	
	public void  viewfactory() {
		util.cls();
		for(String i : punyauser) {
			System.out.printf("|%s|\n",i);
		}
		System.out.println();
		System.out.println("press any key to continue");
		sc.nextLine();
		return;
	}
	
	public void tradecenter() {
		while(true) {			
			util.cls();
			Random rand = new Random();
			System.out.println("=".repeat(30));
			System.out.println("| Your resources|");
			System.out.println("=".repeat(30));
			System.out.printf("Wood : %d\n", user.getWood());
			System.out.printf("Stone : %d\n", user.getStone());
			System.out.printf("Gold : %d\n", user.getGold());
			System.out.printf("Money : %d\n", user.getMoney());
			System.out.println("=".repeat(30));
			System.out.println();
			int randomcost1 = rand.nextInt(11) + 10;
			int randomcost2 = rand.nextInt(11) + 10;
			int randomcost3 = rand.nextInt(11) + 10;
			int randomtype1 = rand.nextInt(3);
			int randomtype2 = rand.nextInt(3);
			int randomtype3 = rand.nextInt(3);
			String type1 = null;
			if(randomtype1 == 0)type1 = "gold";
			if(randomtype1 == 1)type1 = "wood";
			if(randomtype1 == 2)type1 = "stone";
			
			String type2 = null;
			if(randomtype2 == 0)type2 = "gold";
			if(randomtype2 == 1)type2 = "wood";
			if(randomtype2 == 2)type2 = "stone";
			
			String type3 = null;
			if(randomtype3 == 0)type3 = "gold";
			if(randomtype3 == 1)type3 = "wood";
			if(randomtype3 == 2)type3 = "stone";
			
			
			System.out.println("trade center");
			System.out.println("=".repeat(30));
			System.out.printf("1 | %2d %5s | 100 Money\n", randomcost1, type1);
			System.out.printf("2 | %2d %5s | 100 Money\n", randomcost2, type2);
			System.out.printf("3 | %2d %5s | 100 Money\n", randomcost3, type3);
			System.out.println("=".repeat(30));
			
			System.out.println();
			System.out.print("choose offer [0 to go back] : ");
			int choice = sc.nextInt();
			sc.nextLine();
			if(choice == 0)break;
			if(choice == 1) {
				if(type1.equals("gold")) {
					if(user.getGold() > randomcost1) {
						int temp = user.getGold();
						user.setGold(temp - randomcost1);
						int money = user.getMoney();
						user.setMoney(money + 100);
					} else {
						System.out.println("not enough money enter to continue");
						sc.nextLine();
					}
				} else if(type1.equals("stone")) {
					if(user.getStone() > randomcost1) {
						int temp = user.getStone();
						user.setStone(temp - randomcost1);
						int money = user.getMoney();
						user.setMoney(money + 100);
					} else {
						System.out.println("not enough money enter to continue");
						sc.nextLine();
					}
				} else if(type1.equals("wood")) {
					if(user.getWood() > randomcost1) {
						int temp = user.getWood();
						int money = user.getMoney();
						user.setWood(temp - randomcost1);
						user.setMoney(money + 100);
					} else {
						System.out.println("not enough money enter to continue");
						sc.nextLine();
					}
				}
			}
			if(choice == 2) {
				if(type2.equals("gold")) {
					if(user.getGold() > randomcost2) {
						int temp = user.getGold();
						user.setGold(temp - randomcost2);
						int money = user.getMoney();
						user.setMoney(money + 100);
					} else {
						System.out.println("not enough money enter to continue");
						sc.nextLine();
					}
				} else if(type2.equals("stone")) {
					if(user.getStone() > randomcost2) {
						int temp = user.getStone();
						user.setStone(temp - randomcost2);
						int money = user.getMoney();
						user.setMoney(money + 100);
					} else {
						System.out.println("not enough money enter to continue");
						sc.nextLine();
					}
				} else if(type2.equals("wood")) {
					if(user.getWood() > randomcost2) {
						int temp = user.getWood();
						int money = user.getMoney();
						user.setWood(temp - randomcost2);
						user.setMoney(money + 100);
					} else {
						System.out.println("not enough money enter to continue");
						sc.nextLine();
					}
				}
			}
			if(choice == 3) {
				if(type3.equals("gold")) {
					if(user.getGold() > randomcost3) {
						int temp = user.getGold();
						user.setGold(temp - randomcost3);
						int money = user.getMoney();
						user.setMoney(money + 100);
					} else {
						System.out.println("not enough money enter to continue");
						sc.nextLine();
					}
				} else if(type3.equals("stone")) {
					if(user.getStone() > randomcost3) {
						int temp = user.getStone();
						user.setStone(temp - randomcost3);
						int money = user.getMoney();
						user.setMoney(money + 100);
					} else {
						System.out.println("not enough money enter to continue");
						sc.nextLine();
					}
				} else if(type3.equals("wood")) {
					if(user.getWood() > randomcost3) {
						int temp = user.getWood();
						int money = user.getMoney();
						user.setWood(temp - randomcost3);
						user.setMoney(money + 100);
					} else {
						System.out.println("not enough money enter to continue");
						sc.nextLine();
					}
				}
			}
		}
	}
	
	public void gameloop() {
		while(true) {			
			util.cls();
			System.out.printf("Day : %d\n", current_day);
			System.out.println("=".repeat(30));
			System.out.println("| Your resources|");
			System.out.println("=".repeat(30));
			System.out.printf("Wood : %d\n", user.getWood());
			System.out.printf("Stone : %d\n", user.getStone());
			System.out.printf("Gold : %d\n", user.getGold());
			System.out.printf("Money : %d\n", user.getMoney());
			System.out.println("=".repeat(30));
			System.out.println();
			System.out.printf("your factories\n gold : %d\nstone : %d\nwood : %d\n", gold1.getTotal(), stone1.getTotal(), wood1.getTotal());
			System.out.println();			
			System.out.println("actions:");
			System.out.println("1. Finish day");
			System.out.println("2. Buy factory");
			System.out.println("3. View all factory");
			System.out.println("4. Trade center");
			System.out.println("5. Exit game");
			System.out.println();
			System.out.print("Choose action [1-5] :");
			int choice = sc.nextInt();
			sc.nextLine();
			if(choice == 1)daytime();
			if(choice == 2)buyfactory();
			if(choice == 3)viewfactory();
			if(choice == 4)tradecenter();
			if(choice == 5)break;
		}
		util.cls();
		System.out.println("gameover");
		System.out.println("=".repeat(20));
		System.out.printf("final score : %d\n",user.getMoney());
		System.out.println();
		System.out.println("press enter to continue");
		sc.nextLine();
	}
	
	public void menu() {
		while(true) {	
			util.cls();
			System.out.println("Fact?ory");
			System.out.println("1. Play game");
			System.out.println("2. Exit");
			System.out.print(">> ");
			int choice = sc.nextInt();
			sc.nextLine();
			if(choice == 1) {
				gameloop();
				break;
			}
			if(choice == 2)break; 
		}
		return;
	}
	
	public Main() {
		menu();
	}
	
	public static void main(String[] args) {
		new Main();
	}
}
