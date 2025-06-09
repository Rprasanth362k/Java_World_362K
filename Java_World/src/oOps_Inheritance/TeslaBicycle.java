package oOps_Inheritance;

public class TeslaBicycle extends Bicycle{
	
	public int seatHeight;
	
	
	TeslaBicycle(int gear, int speed,int startHeight)
	{
		super(gear,speed);
		seatHeight=startHeight;
		
	}
	public void setHeight(int newValue)
	{
		seatHeight = newValue;
		
		
	}
	@Override
	public String toString()
	{
		return (super.toString()+ "\n seat height is "+ seatHeight);
	}
    public static void main(String args[])
    {
    	TeslaBicycle tb = new TeslaBicycle(3,100,25);
    	System.out.println(tb.toString());
    }

}
