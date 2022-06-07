import java.util.Scanner;
public class nand {
	public static boolean NAND(boolean x,boolean y) {
		return !x||!y;
	}
	static boolean toBoolean(int i) {
		if(i == 1) {return true;}
		else {return false;}
	}
	static String convertToString(int[] a) {
		StringBuffer sb = new StringBuffer();
		for(int j = 0;j<a.length;j++) {sb.append(a[j]);}
		
		String convertedto_string = sb.toString();
		return convertedto_string;
	} //it works. And I created this just in case I needed such functions.
	public static void main(String[] args) {
		boolean i; //just declaring the 2 inputs for the NAND gate 
		boolean j;
		//taking inputs as integers
		Scanner in = new Scanner(System.in);
		System.out.print("1st input is: ");
		int x = in.nextInt();
		System.out.print("2nd input is: ");
		int y = in.nextInt();
		//have to convert them to boolean
		if(x == 1) {i = true;}	//converting integers to boolean
		else {i = false;}
		if(y == 1) {j = true;}
		else {j = false;}
		boolean output = NAND(i,j);
		int val = (output) ? 1:0;    //converting the boolean value to int to be shown
		System.out.println("the output is nand(x,y) is: "+ val);
	}
}//lmao this is the new comment; reflect this
