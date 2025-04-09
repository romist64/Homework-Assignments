package javaHomework6_1_Proj;

public class Main {
	public static void main(String[] args) {
		Flight test = new Flight("Lavos", "Champaign, Illinois", "Testing equipment", 107, 21);
		Flight failed = new Flight("Jeopardy", "Kennedy, Florida", "Bioweapons", 3, 0);
		Flight milshuttle = new Flight("Corsetta", "Washington D.C., Maryland", "Weaponry", 342, 203);
		failed.setPassengers(1);
		System.out.println(milshuttle.getName());
		System.out.println(test.getManifest());
	}
}
