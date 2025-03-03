package javaHomework2_1;
import java.util.Scanner;

public class Main {
	/*
     *Declare a variable called selection with the value of 2. Use a  switch statement to accomplish the following: If the user enters 1, display a message saying the color is yellow. If the user enters  2, display a message saying the color is blue. If the user enters  3, display a message saying the color is red. If the user input is not 1, 2, or 3, display a message saying the selection was invalid
	 */
	public static void main(String[] args) {
		boolean canVote = false;
		int lollmao = 5;
		int icantsee = 61;
		if(lollmao == icantsee) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		int pipopipo = 998;
		int popipo = 1;
		if(pipopipo > popipo) {
			System.out.println(pipopipo);
		}else{
			System.out.println(popipo);
		}
		int eger3 = 57;
		if(eger3 > popipo && pipopipo > eger3) {
			System.out.println(eger3);
		}else if(popipo > eger3 && pipopipo > popipo) {
			System.out.println(popipo);
		}else {
			System.out.println(pipopipo);
		}
		int selection = 2;
		Scanner sombre = new Scanner(System.in);
		selection = sombre.nextInt();
		sombre.close();
		if(selection == 1) {
			System.out.println("You have Chosen: Yellow");
		}else if(selection == 2) {
			System.out.println("You have Chosen: Blue");
		}else if(selection == 3){
			System.out.println("You have Chosen: Red");
		}else {
			System.out.println("Invalid");
		}
	}
}
