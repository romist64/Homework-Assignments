package javaHomework4_1;

public class Main{
	public static void main(String[] args){
		String[] strings = {"Yarn", "Rope", "Polyester", "Polyeurathane"};
		System.out.println(strings[2]);
		strings[1] = "Cobweb";
		System.out.println(strings.length-1);
		for(int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
		String[] elements = {"Arsenic", "Oxygen", "Tungsten", "Xenon"};
		String[][] arrays = {strings, elements};
		for(int i = 0; i < arrays.length; i++) {
			for(int j = 0; j < arrays[i].length; j++) {
				System.out.println(arrays[i][j]);
			}
		}
	}
}