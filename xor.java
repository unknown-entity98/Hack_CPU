import java.util.Scanner;

public class xor extends not{
	//xor class contains all the basic gates - or,and,not,nand (not xnor, since I didnt see any use in making it)
	static boolean XOR(boolean a,boolean b) {
		boolean x1 = NAND(a,b);
		boolean x2 = NAND(a,x1);
		boolean x3 = NAND(b,x1);
		boolean x4 = NAND(x3,x2);
		return x4;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean i,j;
		//making an object to take the inputs (and taking the inputs)
		Scanner in = new Scanner(System.in);
		System.out.print("1st input is(you can give integer 0 or 1): ");
		int x = in.nextInt();
		System.out.print("2nd input is: ");
		int y = in.nextInt();
		//making their boolean versions ready for evaluating the output based on given inputs
		if(x==1) {i = true;}
		else {i = false;}
		
		if(y == 1) {j = true;}
		else {j = false;}
		//now they are ready for use 
		//gonna get the outputs now
		boolean output = XOR(i,j);
		int val = (output)? 1:0;
		System.out.println("the output of XOR(input1,input2) is: "+val);
	}
}