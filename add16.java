import java.util.*;

public class add16 extends full_adder{
	//adds two 16-bit values
	static int[] ADD16(String a,String b) { 
		String a1[] = a.split("");   //trying to make the input Strings into array having each letter
		String b1[] = b.split("");
		int[] ar1 = new int [16]; //did this because I wanted empty integer arrays ar1,ar2
		int[] ar2 = new int [16];
		for(int i = 0;i<a1.length;i++) {    //doing this because I want to add converted string parts to int arrays
			ar1[i] = Integer.parseInt(a1[i]);
			ar2[i] = Integer.parseInt(b1[i]);
		}
		boolean trial1[] = HALF_ADDER(toBoolean(ar1[15]),toBoolean(ar2[15])); //in HDL, a[0],b[0] ->c0
		boolean trial2[] = FULL_ADDER(toBoolean(ar1[14]),toBoolean(ar2[14]),trial1[1]);//a[1],a[2],c0->c1
		boolean trial3[] = FULL_ADDER(toBoolean(ar1[13]),toBoolean(ar2[13]),trial2[1]);//a[2],b[2],c1->c2
		boolean trial4[] = FULL_ADDER(toBoolean(ar1[12]),toBoolean(ar2[12]),trial3[1]);//a[3],b[3],c2->c3
		boolean trial5[] = FULL_ADDER(toBoolean(ar1[11]),toBoolean(ar2[11]),trial4[1]);//a[4],b[4],c3->c4
		boolean trial6[] = FULL_ADDER(toBoolean(ar1[10]),toBoolean(ar2[10]),trial5[1]);//a[5],b[5],c4->c5
		boolean trial7[] = FULL_ADDER(toBoolean(ar1[9]),toBoolean(ar2[9]),trial6[1]);//a[6],b[6],c5->c6
		boolean trial8[] = FULL_ADDER(toBoolean(ar1[8]),toBoolean(ar2[8]),trial7[1]);//a[7],b[7],c6->c7
		boolean trial9[] = FULL_ADDER(toBoolean(ar1[7]),toBoolean(ar2[7]),trial8[1]);//a[8],b[8],c7->c8
		boolean trial10[] = FULL_ADDER(toBoolean(ar1[6]),toBoolean(ar2[6]),trial9[1]);//a[9],b[9],c8->c9
		boolean trial11[] = FULL_ADDER(toBoolean(ar1[5]),toBoolean(ar2[5]),trial10[1]);//a[10],b[10],c9->c20
		boolean trial12[] = FULL_ADDER(toBoolean(ar1[4]),toBoolean(ar2[4]),trial11[1]);//a[11],b[11],c10->c11
		boolean trial13[] = FULL_ADDER(toBoolean(ar1[3]),toBoolean(ar2[3]),trial12[1]);//a[12],b[12],c11->c12
		boolean trial14[] = FULL_ADDER(toBoolean(ar1[2]),toBoolean(ar2[2]),trial13[1]);//a[13],b[13],c12->c13
		boolean trial15[] = FULL_ADDER(toBoolean(ar1[1]),toBoolean(ar2[1]),trial14[1]);//a[14],b[14],c13->c14
		boolean trial16[] = FULL_ADDER(toBoolean(ar1[0]),toBoolean(ar2[0]),trial15[1]);//a[15],b[15],c14->c15
		boolean b_output[] = {trial16[0],trial15[0],trial14[0],trial13[0],trial12[0],trial11[0],trial10[0],trial9[0],trial8[0],trial7[0],trial6[0],trial5[0],trial4[0],trial3[0],trial2[0],trial1[0]};
		int final_version[] = new int [16];
		for(int i = 0;i<16;i++) {
			final_version[i] = (b_output[i]? 1:0);
		}
		return final_version;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//boolean i,j; don't think I can use this here yet, Wait.
		//lets create objects
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the first 16-bit input -> ");
		String x = in.next();
		System.out.print("Enter the second 16-bit input -> ");
		String y = in.next();
		//inputs taken
		
		//:worrypat:
		int retrieved_inputs[] = ADD16(x,y); 
		//got the result of it as an integer array, now I will combine into a single String
		StringBuffer sb = new StringBuffer();
		for(int i = 0;i<16;i++) {
			sb.append(retrieved_inputs[i]);
		}
		String str1 = sb.toString();
		System.out.print(str1);
	}

}
