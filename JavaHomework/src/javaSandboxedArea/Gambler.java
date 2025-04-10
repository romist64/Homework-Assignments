package javaSandboxedArea;

import java.util.Scanner;

public class Gambler{
	public static void main(String[] args) {
		String options[] = {"Pear", "Apple", "Orange", "Lime", "Lemon", "Cherry", "Bar", "7"};
		//					"Orange", "Cherry", "7", "Bar", "Apple", "Pear", "Lemon", "Lime"
		int score = 100;
		boolean toggle = true;
		Scanner sombre = new Scanner(System.in);
		while(toggle) {
			double mult = slotMachine(options);
			if(mult == 0.5) {
				System.out.println("Aww! You lost! Lose half of your points!");
			}else {
				System.out.println("Nice! You won! Let's see how much you got!");
			}
			System.out.println("Score Multipler: "+mult);
			score *= mult;
			System.out.println("Score: "+score);
			System.out.println("Again? (Y/N)");
			if(sombre.nextLine().equalsIgnoreCase("N")) {
				toggle = false;
			}
		}
		sombre.close();
	}
	
	public static double slotMachine(String options[]) {
		String theWayIKnowHow[] = {"Placeholder", "Placeholder", "Placehoder"};
		double intiplier = 0.5;
		for(int i = 0; i < 3; i++) {
			int chosen = (int)(Math.random()*options.length);
			theWayIKnowHow[i] = options[chosen];
		}
		String machine = theWayIKnowHow[0]+" "+theWayIKnowHow[1]+" "+theWayIKnowHow[2];
		System.out.println(machine);
		if(theWayIKnowHow[0] == theWayIKnowHow[1] || theWayIKnowHow[0] == theWayIKnowHow[2]) {
			for(int i = 0; i <= options.length-1; i++) {
				if(theWayIKnowHow[0] == options[i]) {
					intiplier += ((i+1)/2);
				}
			}
		}else if(theWayIKnowHow[1] == theWayIKnowHow[2]) {
			for(int i = 0; i <= options.length-1; i++) {
				if(theWayIKnowHow[1] == options[i]) {
					intiplier += ((i+1)/2);
				}
			}
		}else if(theWayIKnowHow[0] == theWayIKnowHow[1] && theWayIKnowHow[1] == theWayIKnowHow[2]) {
			for(int i = 0; i <= options.length-1; i++) {
				if(theWayIKnowHow[0] == options[i]) {
					intiplier *= (i+1);
				}
			}
		}
		return intiplier;
	}
}