package logicProgramme;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UsingBufferedReaderClass {
// how to use BufferReader to read a line of input from the user and print it to the console.
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String input  =reader.readLine();
		
		System.out.println(input);
		

	}

}
/*
 * 1.Bufferedreader -> Bufferedreader in java class read the text from the charater(not byte )  input stream. 
 * 
 * system.in read the byte from the keyboard  not characters.(system.in  can not directely  read string or line -only raw bytes)
 * 
 *2.InputStreamReader -> it is a bridge b/w System.in (bytes)  and java character
 * it is convert to  byte to character, so help full for  read text from keyboard.
 * 
 * 3.readline() it method  of Bufferereader, it ead one full line of text and it is return a string 
 */

/*BufferedReader it  java class read the text chracter not bytes, system.in  , 
 * it read  input from keyboard like byte not a character, Inputstreamreader is it help convert byte to character ,and read text in keyboard and , it bridge b/w  (system.in)  byte and character, and readLine() methdod of  Bufferereader class,it reade the  text line
 * 
 * 
 */
