package abstraction;

abstract public class Flower {
	//final String flower;
	final String flowerSmell="Awesome";
    public String flowerAge;
    
    Flower(String flowerAge)
    {
    	this.flowerAge=flowerAge;
    }
	abstract public void fragent();
	//abstract private void fragent();
	abstract protected void madicineFlower();
	abstract  void notEatableFlowers();
	

	

	
	public static void nonFragent()
	{
		
	}
	public static void main(String args[]) {
		//Flower flo = new Flower(); can not instantiated in abstract class
		
	}


}
