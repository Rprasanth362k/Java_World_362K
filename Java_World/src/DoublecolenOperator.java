package ConsumerInterface;

import java.util.Arrays;
import java.util.List;

public class DoubleColonDemo {

	public static void main(String[] args) {
		List l = Arrays.asList(10,20,30,5,7,8,6);
		
		//l.forEach(num -> System.out.println(num));
		// now we simply lamda expression. that is Double colum operatopr
		//remove  argument front , arrow,passing argument  that is simply fy :: operator
			l.forEach(num -> System.out.println(num));
			// System.out.println(num)) this method and you gived num argument 
			System.out.println("Below is Double Coumn operator using");
			l.forEach(System.out::println);

	}

}
/* @FuntionalInterface
 * Interface Contract
 * {
 * public int  calculate(int no);
 * 
 * 
 * }
 * 
 * 
 * public class  Abc
 * 
 *int  add (int no)  // own reference Abc
 *{
 *return no+200;
 *
 *}
 *
 * {
 * 
 * Public static  void main (String[] args)
 * 
 * {
 * Abc abc_ref = new Abc();
 * 
 * c    //Contract c = (no) -> no + 100; // lamda expression // that abstract method implented and returned passed to abstract method
 * d // now use exp
 *Contract c == abc_ref::add;  // now we can not create lamda expression now use own expression this stem ,that like , method reference 
 * int  result =c.calculate(123); 
 * System.out.println(result);
 * 
 * 
 *} 
 * 
 * 
 * 
 * 
 * 
 */
