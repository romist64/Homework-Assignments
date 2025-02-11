package javaHomework2_4;
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("1. Greet me\n2.Insult me\n3. Tell me a joke");
		System.out.print("Please make a selection: ");
		int selection = input.nextInt();
		switch(selection){
		case 1:
			System.out.println("Hello, human!");
			break;
		case 2:
			System.out.println("Your mother was a hamster and your father smelt of elderberries!");
			break;
		case 3:
			System.out.print("Why did the chicken cross the road? Press enter to continue...");
			input.nextLine();
			System.out.println("to get to the other side!");
			break;
		default:
			System.out.println("Invalid Selection");
		}
		input.close();
	}
}