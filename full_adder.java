import java.util.Scanner;
public class full_adder extends half_adder{
	//unlike half adder, full adder can add 3 inputs 
	static boolean[] FULL_ADDER(boolean a,boolean b,boolean c) {
		boolean ar1[] =  HALF_ADDER(a,b);//{A XOR B, A.B}
		boolean ar2[] =  HALF_ADDER(c,ar1[0]);
		boolean b_carry_fa = OR(ar1[1],ar2[1]);
		boolean ar3[] = {ar2[0],b_carry_fa};
		return ar3;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean i,j,k;
		//creating objects
		Scanner in = new Scanner(System.in);
		System.out.print("1st input is: ");
		int x = in.nextInt();
		System.out.print("2nd input is: ");
		int y = in.nextInt();
		System.out.print("the carry input is: ");
		int z = in.nextInt();
		//making the boolean versions of them
		if(x==1) {i = true;}
		else {i = false;}
		
		if(y == 1) {j = true;}
		else {j = false;}
		
		if(z == 1) {k = true;}
		else {k = false;}
		//giving them as inputs and getting the result
		boolean b_output[] = FULL_ADDER(i,j,k);
		int sum_full_adder = (b_output[0])? 1:0;
		int carry_full_adder = (b_output[1])? 1:0;
		System.out.println("the sum is: "+sum_full_adder);
		System.out.println("the carry is: "+carry_full_adder);
	}

}
