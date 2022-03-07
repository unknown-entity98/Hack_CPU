import java.util.Scanner;
public class or extends nand {
	static boolean OR(boolean x,boolean y) {
		boolean a = NAND(x,x);
		boolean b = NAND(y,y);
		return NAND(a,b);
	}
	static String Or8Way(String a) {
		//first making this an integer array
		String a1[] = a.split("");
		int ar1[] = new int [8];
		for(int j = 0;j<a1.length;j++) {
			ar1[j] = Integer.parseInt(a1[j]); 
		}
		//now I'll commence the boolean evaluation;
		int ar2; //this will be a little big :cri:
		ar2 = (OR(toBoolean(ar1[0]),toBoolean(ar1[1])))?1:0;
		ar2 = (OR(toBoolean(ar2),toBoolean(ar1[2])))?1:0;
		ar2 = (OR(toBoolean(ar2),toBoolean(ar1[3])))?1:0;
		ar2 = (OR(toBoolean(ar2),toBoolean(ar1[4])))?1:0;
		ar2 = (OR(toBoolean(ar2),toBoolean(ar1[5])))?1:0;
		ar2 = (OR(toBoolean(ar2),toBoolean(ar1[6])))?1:0;
		ar2 = (OR(toBoolean(ar2),toBoolean(ar1[7])))?1:0;
		return Integer.toString(ar2);
	}
	public static void main(String[] args) {
		boolean i; //just declaring the 2 inputs for the NAND gate 
		boolean j;
		//taking inputs as integers
		Scanner in = new Scanner(System.in);
		System.out.print("1st input is: ");
		int x = in.nextInt();
		System.out.print("2nd input is: ");
		int y = in.nextInt(); 
		System.out.print("which string do you want to perform Or8Way on? :");
		String str = in.next();
		//have to convert them to boolean
		if(x == 1) {i = true;}	//converting integers to boolean
		else {i = false;}	
		if(y == 1) {j = true;}
		else {j = false;}
		
		System.out.println("When we do Or8Way, we get -> "+ Or8Way(str));
		boolean output = OR(i,j);
		int val = (output)? 1:0;    //converting the boolean value to int to be shown
		System.out.println("the output of OR(i,j) is: "+val);
	}
}
