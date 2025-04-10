package javaHomework7x8_Proj;

public class SlotMachine {
	private Slot one;
	private Slot two;
	private Slot tre;
	public SlotMachine()/*random, for ease of use. plus it makes a lot of sense*/{
		one = new Slot(((int)(Math.round((Math.random()*2)+1))));
		two = new Slot(((int)(Math.round((Math.random()*2)+1))));
		tre = new Slot(((int)(Math.round((Math.random()*2)+1))));
	}
	public SlotMachine(int val1, int val2, int val3)/*"maximized" version of slot constructor for integers*/{
		one = new Slot(val1);
		two = new Slot(val2);
		tre = new Slot(val3);
	}
	public SlotMachine(String val1, String val2, String val3)/*"maximized" version of slot constructor for strings*/{
		one = new Slot(val1);
		two = new Slot(val2);
		tre = new Slot(val3);
	}
	public String toString() {
		return "| "+one.toString()+" | "+two.toString()+" | "+tre.toString()+" |";
	}
	public Slot seeSlotOne() {
		return one;
	}
	public Slot seeSlotTwo() {
		return two;
	}
	public Slot seeSlotThree() {
		return tre;
	}
	public boolean setSlotOne(int newVal) {
		return one.setFruit(newVal);
	}
	public boolean setSlotTwo(int newVal) {
		return two.setFruit(newVal);
	}
	public boolean setSlotThree(int newVal) {
		return tre.setFruit(newVal);
	}
	public boolean setSlotOne(String newVal) {
		return one.setFruit(newVal);
	}
	public boolean setSlotTwo(String newVal) {
		return two.setFruit(newVal);
	}
	public boolean setSlotThree(String newVal) {
		return tre.setFruit(newVal);
	}
	public void spin() {
		one.spin();
		two.spin();
		tre.spin();
	}
}
