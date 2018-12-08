package oop.superHero;
/**
 * Write a java application using all the OOP features.
 * Include few constructors in class. Use all the keywords possible.
 * 
 * @author Papri Barua
 *
 */

public class TestSuperHero {

	public static void main(String[] args) {
		
		System.out.println("A superhero is a benevolent fictional character with superhuman powers."
				+ "Let's take a look at some superheroes!!!\n");
		
		Ancestor ant1 = new Superman();
		Ancestor ant2 = new Batman();
		Ancestor ant3 = new Spiderman();
		
		Descendant des = new Descendant();
		
	    System.out.print("Superman" + "\n*********" + "\nReal Name: ");
		Superman superMan = new Superman("Clark Kent");
		superMan.nameOfParents();
		
		System.out.println("Place of Birth: " + Superman.placeOfBirth);
		ant1.costume("Costumes: " + "1) Blue shirt & tights with a yellow and red 'S' on chest " , "2) Red cape ",  "3) Red boots\n");
		superMan.canFly();
		superMan.hasPower();
		
		// Encapusulation implemented
	    superMan.setWeakness("Weaknesses: " + "1) Green Kryptonite => Extremely toxic   2) Red Kryptonite => Affects his mental state or remove powers" );
		System.out.println(superMan.getWeakness());
		superMan.setLoveInterests("Love Interests: " + "1) Lana Lang   2) Lois Lane   3) Lori Lemaris   4) Wonder Woman ");
		System.out.println(superMan.getLoveInterests());
		Descendant.nameOfChildren();
		des.canFly();
		superMan.display();
		
		System.out.print("Batman" + "\n*********" + "\nReal Name: ");
		Batman batMan = new Batman("Bruce Wayne\n");
		batMan.nameOfParents();
		System.out.println("Place of Birth: " + Batman.placeOfBirth);
		ant2.costume("Costumes: " + "1) Batsuit ","2) Batwings");
		batMan.canFly();
		batMan.hasPower();
		
		// Encapusulation implemented
	    batMan.setWeakness("\nWeaknesses:  " + "His allies turn against him " );
		System.out.println(batMan.getWeakness());
		batMan.setLoveInterests("Love Interests: " + "1) Catwoman 2) Julie Madison 3) Vicki Vale 4) Talia Al-Ghul 5) Sasha Bordeaux 6) Roan Twomey(aka Red Riding Hood) 7) Silver St. Cloud");
		System.out.println(batMan.getLoveInterests());
		batMan.display();
		
		System.out.print("Spiderman" + "\n***********" + "\nReal Name: ");
		Spiderman spiderMan = new Spiderman("Peter Benjamin Parker\n");
		spiderMan.nameOfParents();
		System.out.println("Place of Birth: " + Spiderman.placeOfBirth);
		Ancestor.costume("Costumes: " + "Red & Blue with black webbing covering the chest\n");
		spiderMan.canFly();
		spiderMan.hasPower();
	
		// Encapusulation implemented
	    spiderMan.setWeakness("Weaknesses: " + "Prone to mutation" );
		System.out.println(spiderMan.getWeakness());
		spiderMan.setLoveInterests("Love Interests:  " + "1) Mary Jane 2) Felicia Hardy 3) Ms. Marvel 4) Betty Brant 5) Liz Allen 6) Gwen Stacy ");
		System.out.println(spiderMan.getLoveInterests());
		spiderMan.display();
		
		System.out.println("\n\nEnd of Program!  Tired....Need Some Super Powers!");
	}

}
