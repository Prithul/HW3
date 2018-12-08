package oop.superHero;

public class Spiderman extends Ancestor{
	
	public static String placeOfBirth = "Queens, NYC, NY";
	String character = "Publisher of Spiderman: Marvel Comics";
	String realName;
	
	// private fields for encapsulation
	private String weakness;
	private String loveInterests;
			
	// Constructors
	public Spiderman() {}
	public Spiderman(String realName) {
		
		this.realName = realName;
		System.out.print(this.realName);
	}
	// super keyword		
    void display() {
    	System.out.println(super.character);
    	System.out.println(character);
	    System.out.print("Created By: Stan Lee, Steve Ditko");
	}		
			
	@Override
	public void canFly() {
		System.out.println("Spiderman can fly too!....sort of");
	}

	@Override
	public void hasPower() {

		System.out.println("\nSpiderman's Assests: ");	
		System.out.println("1) Genius, Agility, Reflexes, " +"\n"
	    		+ "2) Strength, Speed & Stamina" + "\n"
	    		+ "3) Night Vision" + "\n"
	    		+ "4) Ability to stick to solid surfaces" + "\n"
	    		+ "5) Ability to produce spider-web\n");
	}
	
    public void nameOfParents() {
		System.out.println("Parents Name: " + "Not Found!");
	}

    //Getter-Setter methods for encapsulation
	public String getWeakness() {
			return weakness;
	}
	public void setWeakness(String weakness) {
			this.weakness = weakness;
	}
	public String getLoveInterests() {
			return loveInterests;
	}
    public void setLoveInterests(String loveInterests) {
			this.loveInterests = loveInterests;
	}
}
