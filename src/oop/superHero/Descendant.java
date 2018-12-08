package oop.superHero;

public class Descendant extends Superman {
	 

	static void nameOfChildren() {
	System.out.println("\nSuperman's Children: " + "Conner Kent (Clone)" + " & Johnathan Samuel Kent (from Lois Lane)");
	}
	
	@Override
	public void canFly() {
		System.out.println("Can Superman's chidren fly? " + "Not Sure!!!");
	}

	
}
