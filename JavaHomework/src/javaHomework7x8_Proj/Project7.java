package javaHomework7x8_Proj;

public class Project7 {
	public static void main(String[] args) {
		Slot singlet = new Slot("Cherry");
		System.out.println(singlet.toString());
		singlet.spin();
		System.out.println(singlet.toString());
	}
}
