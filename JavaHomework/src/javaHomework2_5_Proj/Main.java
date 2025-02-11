package javaHomework2_5_Proj;
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner sombre = new Scanner(System.in);
		String[] tops = {"","",""};
		System.out.println("Welcome to Chudson Hughes' Potato Bar And Creamery!");
		System.out.println("We offer the following toppings: Yogurt ($1.00), Skittles ($0.75),Tomato ($0.50), Lettuce ($0.30)");
		System.out.print("Please enter first topping: ");
		tops[0] = sombre.nextLine();
		System.out.print("Please enter second topping: ");
		tops[1] = sombre.nextLine();
		System.out.print("Please enter third topping: ");
		tops[2] = sombre.nextLine();
		sombre.close();
		int moneyX100 = 0;
		for(int i = 0; i < tops.length; i++){
			if(tops[i].equalsIgnoreCase("Yogurt")) {
				moneyX100 += 100;
			}else if(tops[i].equalsIgnoreCase("Skittles")) {
				moneyX100 += 75;
			}else if(tops[i].equalsIgnoreCase("Tomato")) {
				moneyX100 += 50;
			}else if(tops[i].equalsIgnoreCase("Lettuce")) {
				moneyX100 += 30;
			}
		}
		System.out.println("Your toppings total cost is $"+(((double)moneyX100))/100);
		if(moneyX100 >= 100) {
			System.out.println("Congradulations! You have saved $"+((((double)moneyX100)*0.1)/100)+"!");
			moneyX100 *= 0.1;
			System.out.println("Your final total cost is $"+(((double)moneyX100))/100);
		}
	}
}