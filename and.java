import java.util.Arrays;
import java.util.Scanner;
public class and extends or{
	static boolean AND(boolean x,boolean y) {
		boolean a = NAND(x,y);
		return NAND(a,a);	
	}
	//will make a new method and16() here (now)
	static String AND16(String a,String b) {
		String a1[] = a.split("");int ar1[] = new int [16];    //making string arrays of each char to convert them to integer 
		String a2[] = b.split("");int ar2[] = new int [16];
		for(int i = 0;i<a1.length;i++) {
			ar1[i] = Integer.parseInt(a1[i]);
			ar2[i] = Integer.parseInt(a2[i]); //now I've made integer arrays
		}
		int a_n[] = new int [16];
		a_n[0] = (AND(toBoolean(ar1[0]),toBoolean(ar2[0])))? 1:0;
		a_n[1] = (AND(toBoolean(ar1[1]),toBoolean(ar2[1])))?1:0;
		a_n[2] = (AND(toBoolean(ar1[2]),toBoolean(ar2[2])))?1:0;
		a_n[3] = (AND(toBoolean(ar1[3]),toBoolean(ar2[3])))?1:0;
		a_n[4] = (AND(toBoolean(ar1[4]),toBoolean(ar2[4])))?1:0;
		a_n[5] = (AND(toBoolean(ar1[5]),toBoolean(ar2[5])))?1:0;
		a_n[6] = (AND(toBoolean(ar1[6]),toBoolean(ar2[6])))?1:0;
		a_n[7] = (AND(toBoolean(ar1[7]),toBoolean(ar2[7])))?1:0;
		a_n[8] = (AND(toBoolean(ar1[8]),toBoolean(ar2[8])))?1:0;
		a_n[9] = (AND(toBoolean(ar1[9]),toBoolean(ar2[9])))?1:0;
		a_n[10] = (AND(toBoolean(ar1[10]),toBoolean(ar2[10])))?1:0;
		a_n[11] = (AND(toBoolean(ar1[11]),toBoolean(ar2[11])))?1:0;
		a_n[12] = (AND(toBoolean(ar1[12]),toBoolean(ar2[12])))?1:0;    //here, i'm adding the input values while taking AND() of boolean values, and converting them back to integers before adding them back into the new integer array
		a_n[13] = (AND(toBoolean(ar1[13]),toBoolean(ar2[13])))?1:0;
		a_n[14] = (AND(toBoolean(ar1[14]),toBoolean(ar2[14])))?1:0;
		a_n[15] = (AND(toBoolean(ar1[15]),toBoolean(ar2[15])))?1:0;
		//after evaluating the whole thing, I'm returning the string version of it
		return convertToString(a_n);
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
		System.out.print("what is the first string? -> ");
		String str1 = in.next();
		System.out.print("What is the second input? -> ");
		String str2 = in.next();
		//have to convert them to boolean
		if(x == 1) {i = true;}	//converting integers to boolean
		else {i = false;}
				
		if(y == 1) {j = true;}
		else {j = false;}
		
		System.out.println("the resultant of AND16(str1,str2) is: "+AND16(str1,str2));
		boolean output = AND(i,j);
		int val = (output)? 1:0;    //converting the boolean into int for showing
		System.out.println("the output of OR(i,j) is: "+val);
	}

}
