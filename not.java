import java.util.Scanner;
public class not extends and{
	//not has and(which has or(which has nand) ); so not involves and,or,nand.
	static boolean NOT(boolean x) {
		return NAND(x,x);
	}
	//will make not16 here
	  static String NOT16(String input){
	  String a1[] = input.split(""); //this is a string array
	  int ar1[] = new int [16];
	  for(int i = 0;i < a1.length;i++){
	      ar1[i] = Integer.parseInt(a1[i]); //now gonna do the whole operation; this was an integer array
	  }
	  ar1[0] = (NOT(toBoolean(ar1[0])))? 1:0;
	  ar1[1] = (NOT(toBoolean(ar1[1])))? 1:0;
	  ar1[2] = (NOT(toBoolean(ar1[2])))? 1:0;
	  ar1[3] = (NOT(toBoolean(ar1[3])))? 1:0;
	  ar1[4] = (NOT(toBoolean(ar1[4])))? 1:0;
	  ar1[5] = (NOT(toBoolean(ar1[5])))? 1:0;
	  ar1[6] = (NOT(toBoolean(ar1[6])))? 1:0;
	  ar1[7] = (NOT(toBoolean(ar1[7])))? 1:0;
	  ar1[8] = (NOT(toBoolean(ar1[8])))? 1:0;
	  ar1[9] = (NOT(toBoolean(ar1[9])))? 1:0;
	  ar1[10] = (NOT(toBoolean(ar1[10])))? 1:0;
	  ar1[11] = (NOT(toBoolean(ar1[11])))? 1:0;
	  ar1[12] = (NOT(toBoolean(ar1[12])))? 1:0;
	  ar1[13] = (NOT(toBoolean(ar1[13])))? 1:0;
	  ar1[14] = (NOT(toBoolean(ar1[14])))? 1:0;
	  ar1[15] = (NOT(toBoolean(ar1[15])))? 1:0;    //gotta combine this integer array
	  
	  return convertToString(ar1);
	  }
	 
	public static void main(String[] args) {
		boolean i;// TODO Auto-generated method stub
		//making an object
		Scanner in = new Scanner(System.in);
		System.out.print("input: ");
		int x = in.nextInt();    //taking the integer input
		System.out.print("Give the number you want to invert?");
		String sys = in.next();
		//making the boolean version of the input
		if(x == 1) {i = true;}
		else{i = false;}
		
		System.out.println("NOT16(input) is: "+NOT16(sys));
		boolean output = NOT(i);
		int val = (output)? 1:0;
		System.out.println("The output of NOT(i): "+val);
	}
}
