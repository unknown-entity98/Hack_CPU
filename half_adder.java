import java.util.Scanner;
public class half_adder extends xor {
	//this is a half adder, which can add only 2 (1-bit) binary numbers
	static boolean[] HALF_ADDER(boolean a,boolean b) {
		boolean b_sum_half_adder = XOR(a,b);
		boolean b_carry_half_adder = AND(a,b);
		return new boolean[] {b_sum_half_adder,b_carry_half_adder}; 
		//returning an array containing the sum and carry; since java doesn't support returning multiple values;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean i,j;
		//to take the inputs
		Scanner in = new Scanner(System.in);
		System.out.print("1st input is: ");
		int x = in.nextInt();
		System.out.print("2nd input is: ");
		int y = in.nextInt();
		//making the boolean values ready
		if(x==1) {i = true;}
		else {i = false;}
		
		if(y == 1) {j = true;}
		else {j = false;}
		//taking values
		boolean bool_array[] = HALF_ADDER(i,j);
		int sum_half_adder = (bool_array[0])? 1:0;
		int carry_half_adder = (bool_array[1])? 1:0;
		System.out.println("The sum is: "+sum_half_adder);
		System.out.println("The carry is: "+carry_half_adder);
	}

}
