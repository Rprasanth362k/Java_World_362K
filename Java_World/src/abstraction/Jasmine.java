package abstraction;

public class Jasmine extends Flower  {
	
	
	String  flowerAge;
	Jasmine(String flowerAge)
	    {
		super("flowerAge");
	    	this.flowerAge=flowerAge;
	    }
 public void fragent()
	{
		
	}
	 protected void madicineFlower()
	{
		
	}
  void notEatableFlowers() {
		

  }
	public static void main(String args[]) {
		Jasmine jas = new Jasmine("5-year");
	}

}
