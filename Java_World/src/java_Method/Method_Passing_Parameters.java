package java_Method;

public class Method_Passing_Parameters {
	
	static String letter = " open the letter\n \n"
			+ "To Smantatha,\n"
			+ "\n"
			+ "You are my heartbeat 💓\n"
			+ "My heart is not beeping... because you're not near to hear it.\n"
			+ "Come close and make it beep again.\n"
			+ "Make my heart lovable with your presence. ❤️\n"
			+ "\n"
			+ "Forever yours,\n"
			+ "Prasanth 💌";

	public static void main(String[] args) {
     sendLetter("prasanth","Java Developer"); //passing string parameter
	}

 static void readLetter(String reader,String career,int age) {
		System.out.println(reader+" read the letter from prasanth:");
        System.out.println(reader + letter);
	}

static void sendLetter(String sender,String career) {

System.out.println(sender+" sent a letter to samantha");	
//System.out.println("Message: "+letter);
System.out.println();
readLetter("samantha","Actress",35);

	}

}
