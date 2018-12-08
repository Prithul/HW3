package oop.superHero;

public class Superman extends Ancestor {
	
	public static String placeOfBirth = "Krypton";
	String character = "Publisher of Superman: DC Comics";
	String realName;
	
	// private fields for encapsulation
    private String weakness;
    private String loveInterests;
		
		
	// Constructors
	public Superman() {}
	public Superman(String realName) {
		// this keyword	
		this.realName = realName;
		System.out.print(this.realName);
	}
	// super keyword	
	void display() {
		   System.out.println(super.character);
		   System.out.println(character);
		   System.out.println("Created By: Jerry Siegel & Joe Shuster\n");
	}
		
		
	@Override
	public void canFly() {
		System.out.println("Superman can fly!");
	}

	@Override
	public void hasPower() {
		
		System.out.println("\nSuperman's Assests: ");	
		System.out.println("1) High intelligence" +"\n"
	    		+ "2) Photographic memory" + "\n"
	    		+ "3) Super breath" + "\n"
	    		+ "4) Multiple sensory powers" + "\n"
	    		+ "5) Thermal projection (heat vision)\n");
	}

	public void nameOfParents() {
		System.out.println("\nParents Name: " + "1) Birth Parents => Jor-El & Lara   2) Adoptive Parents => Jonathan & Martha Kent");
	}
	
	// Getter-Setter methods for encapsulation
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
