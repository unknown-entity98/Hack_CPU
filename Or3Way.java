import java.util.Scanner;
public class Or3Way extends And3Way{
	static boolean Or3Way(boolean x,boolean y, boolean z) {
		boolean a = Or(x,y);
		return Or(a,z);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean i; //just declaring the 2 inputs for the NAND gate 
		boolean j;
		boolean k;
		//taking inputs as integers
		Scanner in = new Scanner(System.in);
		System.out.print("1st input is: ");
		int x = in.nextInt();
		System.out.print("2nd input is: ");
		int y = in.nextInt(); 
		System.out.print("3rd input is: ");
		int z = in.nextInt(); 
		//have to convert them to boolean
		if(x == 1) {i = true;}	//converting integers to boolean
		else {i = false;}
				
		if(y == 1) {j = true;}
		else {j = false;}
		
		if(z == 1) {k = true;}
		else {k = false;}
		
		boolean output = Or3Way(i,j,k);
		int val = (output)? 1:0;    //converting the boolean value to int to be shown
		System.out.println("The output of Or3Way(i,j) is: "+val);
	}

}
