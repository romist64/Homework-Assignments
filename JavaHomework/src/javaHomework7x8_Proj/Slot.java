package javaHomework7x8_Proj;

public class Slot {
	enum Fruits{
		Cherry,
		Lemon,
		Orange
	}
	//	double cherryval;
	//	double lemonval;
	//	double orangeval;
	Fruits fruit;
	// each fruit has different values associated,
	// getting three in a row multiplies this value by three.
	// i.e. cherries give 1.5x, lemons give 2x, and oranges give 3x.
	// three gives 4.5x, 6x, and 9x respectively.

	// ^^^^ I forgot entirely about these, these are unimplemented and I wont implement them lol
	// I also forgot about the huge hint which would've helped with the int setup implementation
	// again, not changing anything since this probably works
	// at least, well enough for proj 7, will see abt 8
	// signing off - RT
	
	
	public String toString(){
		return fruit.name();
	}
	public Slot(String initialFruit) {
		if(initialFruit.equalsIgnoreCase("Cherry")) {
			fruit = Fruits.Cherry;
		}else if(initialFruit.equalsIgnoreCase("Lemon")) {
			fruit = Fruits.Lemon;
		}else if(initialFruit.equalsIgnoreCase("Orange")) {
			fruit = Fruits.Orange;
		}else {
			System.out.println("Error initializing slot at startup. Please contact developers or bugfix.");
		}
	}
	public Slot(int initialFruit) {
		if(initialFruit == 1) {
			fruit = Fruits.Cherry;
		}else if(initialFruit == 2) {
			fruit = Fruits.Lemon;
		}else if(initialFruit == 3) {
			fruit = Fruits.Orange;
		}else {
			System.out.println("Error initializing slot at startup. Please contact developers or bugfix.");
		}
	}
	
	public void spin() {
		int random = (int) (Math.round(Math.random()*2));
		if(random == 0) {
			fruit = Fruits.Cherry;
		}else if(random == 1) {
			fruit = Fruits.Lemon;
		}else if(random == 2) {
			fruit = Fruits.Orange;
		}else {
			System.out.println("Error initializing slot at spin. Please contact developers or bugfix.");
		}
	}
	
	public boolean setFruit(String newFruit) /*Returns true if could set, returns false if matches or failed*/{
		if(newFruit.equalsIgnoreCase("Cherry")) {
			if(fruit == Fruits.Cherry) {
				return false;
			}else {
				fruit = Fruits.Cherry;
				return true;
			}
		}else if(newFruit.equalsIgnoreCase("Lemon")) {
			if(fruit == Fruits.Lemon) {
				return false;
			}else {
				fruit = Fruits.Lemon;
				return true;
			}
		}else if(newFruit.equalsIgnoreCase("Orange")) {
			if(fruit == Fruits.Orange) {
				return false;
			}else {
				fruit = Fruits.Orange;
				return true;
			}
		}else {
			System.out.println("Error initializing slot at new type. Please contact developers or bugfix.");
			return false;
		}
	}

	public boolean setFruit(int newFruit) /*Returns true if could set, returns false if matches or failed*/{
		if(newFruit == 1) {
			if(fruit == Fruits.Cherry) {
				return false;
			}else {
				fruit = Fruits.Cherry;
				return true;
			}
		}else if(newFruit == 2) {
			if(fruit == Fruits.Lemon) {
				return false;
			}else {
				fruit = Fruits.Lemon;
				return true;
			}
		}else if(newFruit == 3) {
			if(fruit == Fruits.Orange) {
				return false;
			}else {
				fruit = Fruits.Orange;
				return true;
			}
		}else {
			System.out.println("Error initializing slot at new type. Please contact developers or bugfix.");
			return false;
		}
	}
	
	public Fruits currentSlot() {
		return fruit;
	}
}
