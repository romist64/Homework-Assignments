package javaHomework5_3;

class Animal{
	public int age;
	// age in year
	public double height;
	// height in centimeters
}

class Pirate extends Animal{
	public double beardVolume;
	// beard volume in liters
	public int missingPieces;
	// missing limbs + things like eyes
	public String position;
}

class Ship extends Animal{
	public int originalPlanks;
	// how many planks the ship started with
	public int newPlanks;
	// how many planks have been removed and replaced
}

class Main{
	public static void main(String[] args) {
		Animal parroteTheParrot = new Animal();
		parroteTheParrot.age = 2;
		parroteTheParrot.height = 14.3;
		Pirate capyCapin = new Pirate();
		capyCapin.age = 83;
		capyCapin.height = 193;
		capyCapin.missingPieces = 3;
		capyCapin.position = "Captain";
		Pirate secondyHand = new Pirate();
		secondyHand.age = 26;
		secondyHand.height = 152;
		secondyHand.missingPieces = 0;
		secondyHand.position = "Quartermaster";
		Pirate deckSwabber = new Pirate();
		deckSwabber.age = 13;
		deckSwabber.height = 104;
		deckSwabber.missingPieces = 1;
		deckSwabber.position = "Ship Cleaner";
		Pirate ropeBoarder = new Pirate();
		ropeBoarder.age = 41;
		ropeBoarder.height = 241;
		ropeBoarder.missingPieces = 5;
		ropeBoarder.position = "Boarder Crew";
		Ship roseDeath = new Ship();
		roseDeath.age = 184;
		roseDeath.height = 180453;
		roseDeath.originalPlanks = 16036;
		roseDeath.newPlanks = 9743;
	}
}