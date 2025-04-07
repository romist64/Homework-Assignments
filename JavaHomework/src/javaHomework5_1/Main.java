package javaHomework5_1;

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