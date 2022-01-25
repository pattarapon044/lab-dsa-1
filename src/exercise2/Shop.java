package exercise2;

class Shop{
	
	//attribute
	private int shirtAmount;
	private double shirtPrice;
	private int bagAmount;
	private double bagPrice;
	private int shoesAmount;
	private double shoesPrice;
	
	public Shop(){
		shirtAmount = 0;
		shirtPrice = 150.0;
		bagAmount = 0;
		bagPrice = 990;
		shoesAmount = 0;
		shoesPrice = 1690;
	 }
	
	public void addShirtAmount() {
		shirtAmount += 1;
	}
	
	public void addBagAmount() {
		bagAmount += 1;
	}
	
	public void addShoesAmount() {
		shoesAmount += 1;
	}
	
	public void viewCard() {
		
		double sum = 0;
		
		//calculate sum of total
		sum += shirtAmount*shirtPrice;
		sum += bagAmount*bagPrice;
		sum += shoesAmount*shoesPrice;
		
		//output
		System.out.println("Shirt : " + shirtAmount);
		System.out.println("Bag   : " + bagAmount);
		System.out.println("Shoes : " + shoesAmount);
		System.out.println("Total price = " + sum + "baht");
	}
  
}
