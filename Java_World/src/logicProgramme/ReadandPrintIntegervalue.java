package logicProgramme;

import java.io.*;
public class ReadandPrintIntegervalue {

	public static void main(String[] args)  throws IOException {
		
		int num = 0;
		int ch;
		System.out.println("Enter an ineger: ");
		
		while((ch = System.in.read()) != '\n')
{
	if (ch >=  '0'  && ch <= '9');
	{
		//  && means both conditons are true 
		num = num * 10 +(ch -'0');
	}
}
		
  System.out.println("Entered integer is:"+ num);   
		/*
		int num;
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter the integer:");
		num = Integer.parseInt(br.readLine());
		System.out.println("Enterd integer is:"+num);
		*/
		
	}

}
