import java.util.*;
public class incrementor extends add16{
	//fetches the next instruction
	static String Inc(String a) {
		return convertToString(ADD16(a,"0000000000000001"));
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Current instruction: ");
		String input = in.next();
		//receiving the string after putting tehe obtained value to work
		String str = Inc(input); //this is our next instruction(in String format)
		System.out.println("The next instruction is: "+str);
	}

}
