import java.util.Scanner;

public class Mux extends nand{

	
		// TODO Auto-generated method stub
		static boolean Mux (boolean l, boolean m,boolean t) {
			boolean z1=NAND(t,t);
			boolean z2=NAND(l,z1);
			boolean z3=NAND(m,t);
		    return NAND (z2,z3);
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			boolean i,j,k;
			Scanner in= new Scanner(System.in);
			System.out.println("1st input");
			int x=in.nextInt();
			System.out.println("2nd input");
			int y=in.nextInt();
			if(x==1) {i = true;}
			else {i = false;}
		   if(y == 1) {j = true;}
			else {j = false;}
		   System.out.println("select line");
			int z=in.nextInt();
			if(z==1) {k=true;}
			else {k=false;}
			
			boolean output=Mux(i,j,k);
			int val = (output)? 1:0;
			System.out.println(val);
		}
}


