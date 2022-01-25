package exercise2;

import java.util.Scanner;

public class MainShop{
	
	public static void main(String[] args){
		
		//declare variable
		int choose;
		Scanner input = new Scanner(System.in);
		Shop shop = new Shop();
		
		//loop for get product in shop
		do{
			//first result on the screen
			System.out.println("_________________________");
			showMenu();
			System.out.println("Choose 1-5 : ");
			choose = input.nextInt();
			
			//switch choose
			switch (choose) {
				case 1:
					shop.addShirtAmount();
					break;
				case 2:
					shop.addBagAmount();
					break;
				case 3:
					shop.addShoesAmount();
					break;
				case 4:
					shop.viewCard();
					break;
				case 5:
					break;
				default:
					break;
			}
			System.out.println("_________________________");
		
		//check for exit
		}while (choose != 5);
		
		//close scanner
		input.close();
	}
	
	public static void showMenu() {
		//output
		System.out.println("=== Shopping ===");
		System.out.println("1.Shirt 150 baht");
		System.out.println("2.Bag 990 baht");
		System.out.println("1.Shoes 1690 baht");
		System.out.println("4.View cart");
		System.out.println("5.Exit");
	}
}

