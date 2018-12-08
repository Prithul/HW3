package oop.superHero;

public class Batman extends Ancestor{
	
	public static String placeOfBirth = "Gotham City";
	String character = "Publisher of Batman: DC Comics";
	String realName;
	
	// private fields for encapsulation
	private String weakness;
	private String loveInterests;
			
	// Constructors
	public Batman() {}
	public Batman(String realName) {
		
		this.realName = realName;
		System.out.print(this.realName);
	}
	// super keyword	
	void display() {
		System.out.println(super.character);
	    System.out.println(character);
	    System.out.println("Created By: Bill Finger (developer, not credited), Bob Kane (concept)\n");
	}
				
	@Override
	public void canFly() {
		System.out.println("\nBatman can fly with Batwing cape!");
	}

	@Override
	public void hasPower() {
	
		System.out.println("\nBatman's Assests : ");	
		System.out.println("1) High intelligence" +"\n"
	    		+ "2) Wealth");
	}
	
    public void nameOfParents() {
		System.out.println("Parents Name: "+ "Thomas Wayne and Martha Wayne");
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
