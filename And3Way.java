import java.util.Scanner;
public class And3Way {
	public static boolean NAND(boolean x,boolean y) {
		return !x||!y;
	}
	static boolean Or(boolean x,boolean y) {
		boolean a = NAND(x,x);
		boolean b = NAND(y,y);
		return NAND(a,b);
	}
	static boolean And(boolean x,boolean y) {
		boolean a = NAND(x,y);
		return NAND(a,a);	
	}
	static boolean NOT(boolean x) {
		return NAND(x,x);
	}
	static boolean XOR(boolean a,boolean b) {
		boolean x1 = NAND(a,b);
		boolean x2 = NAND(a,x1);
		boolean x3 = NAND(b,x1);
		boolean x4 = NAND(x3,x2);
		return x4;
	}
	static boolean And3Way(boolean m, boolean n, boolean o) {
		boolean y1=And(m,n);
		return And(y1,o);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean i,j,k;
		
		Scanner in= new Scanner(System.in);
		System.out.print("1st input: ");
		int x=in.nextInt();
		System.out.print("2nd input: ");
		int y=in.nextInt();
		System.out.print("3rd input: ");
		int z=in.nextInt();
		if(x==1) {i = true;}
		else {i = false;}
		
		if(y == 1) {j = true;}
		else {j = false;}
		
		if(z == 1) {k = true;}
		else {k = false;}
		
		boolean output=And3Way(i,j,k);
		
		int val = (output)? 1:0;
		System.out.println("The output is And3Way(x,y) is: "+ val);
	}

}
