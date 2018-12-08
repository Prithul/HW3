package oop.superHero;

public abstract class Ancestor implements SuperHero {
	
	String character = "\nSuper Heroes are DC Comic or Marvel character!";

	
	// abstract method
	public abstract void nameOfParents();
	
	// overloading
	public void costume(String s1, String s2, String s3) {
		System.out.println(s1 + s2 + s3);
	}
     // overloading
     public void costume(String s1, String s2) {
 		System.out.println(s1 + s2);
 	}
     // overloading
     public static void costume(String s1) {
 		System.out.println(s1);
 	}

}
