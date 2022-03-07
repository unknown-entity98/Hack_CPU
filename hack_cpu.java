import java.util.*;
public class hack_cpu extends alu{
//give a string input, it gives string output form alu, and we better record that
	  static String ARegister(String already_in_A,String input,int load){
	  String s1 = MUX16(already_in_A,input,load);
	  String s2 = DFF(s1);
	  return s2;
	  }
	  static String DRegister(String already_in_A,String input,int load){
	  String s1 = MUX16(already_in_A,input,load);
	  String s2 = DFF(s1);
	  return s2;
	  }
	 static void HAC_CPU(String prev_in_A,String prev_in_D,String prev_out_of_alu,String input_instr,int reset,String FBout,String inM){ 
	  String a1[] = input_instr.split(""); int ar1[] = new int [16];//making my string input -> integer array, then manipulating it
	  for(int i = 0;i<a1.length;i++){ar1[i] = Integer.parseInt(a1[i]);}
	  String into_AReg = MUX16(input_instr,prev_out_of_alu,ar1[0]);
	  int load_inA = (OR(NOT(toBoolean(ar1[0])),toBoolean(ar1[10])))?1:0;
	  String addressM = ARegister(prev_in_A,into_AReg,load_inA);
	  System.out.println("value stored in A (before the computation occurs) is: "+addressM);
	  String AorM = MUX16(addressM,inM,ar1[3]);
	  int load_inD = (AND(toBoolean(ar1[0]),toBoolean(ar1[11])))?1:0;
	  String D = DRegister(prev_in_D,prev_out_of_alu,load_inD);
	  System.out.println("value stored in D (before the computation occurs) is: "+D);
	  String output_of_alu[] = ALU(D,AorM,ar1[4],ar1[5],ar1[6],ar1[7],ar1[8],ar1[9]);  //returns out,ng,zr
	  System.out.println("output of alu ->"+output_of_alu[0]);
	  System.out.println("ng value is: "+output_of_alu[1]);
	  System.out.println("zr value is: "+output_of_alu[2]);
	  int writeM = (AND(toBoolean(ar1[0]),toBoolean(ar1[12])))?1:0;
	  //this is a whole calc for the load part
	  boolean mid1 = AND(toBoolean(ar1[14]),toBoolean(Integer.parseInt(output_of_alu[2])));
	  boolean mid2 = AND(toBoolean(ar1[13]),toBoolean(Integer.parseInt(output_of_alu[1])));
	  boolean mid3 = AND(toBoolean(ar1[15]),NOT(toBoolean(Integer.parseInt(output_of_alu[2]))));
	  boolean mid4 = AND(mid3,NOT(toBoolean(Integer.parseInt(output_of_alu[1]))));
	  boolean mid5 = AND(toBoolean(ar1[13]),toBoolean(ar1[14]));
	  boolean mid6 = AND(mid5,toBoolean(ar1[15]));
	  boolean mid7 = OR(mid1,mid2);
	  boolean mid8 = OR(mid4,mid6);
	  boolean mid9 = OR(mid7,mid8);
	  boolean b_loadof_pc = AND(toBoolean(ar1[0]),mid9);
	  
	  String pc = PC(FBout,addressM,(b_loadof_pc)?1:0,(NOT(b_loadof_pc))?1:0,reset);
	  System.out.println("PC val -> "+ pc);
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("What was the value previously stored in A register? (if 1st time,give 0s) ->");
		String prev_in_A = in.next();
		System.out.print("What was the value previously stored in the D register? (if 1st time,give 0s) ->");
		String prev_in_D = in.next();
		System.out.print("What was the previous output of ALU? (if 1st time,give 0s) ->");
		String prev_out_of_alu = in.next();
		System.out.print("What is the input instruction you want to give? ->");
		String input_instr = in.next();
		System.out.print("Do you want to reset is? ");
		int reset = in.nextInt();
		System.out.print("What is inM (just in case)? ->");
		String inM = in.next();
		System.out.print("What was the previous output of PC? ->");
		String FBout = in.next();
		//inputs taken
		HAC_CPU(prev_in_A,prev_in_D,prev_out_of_alu,input_instr,reset,FBout,inM);
	}

}
//my heck cpu; when we give @12345, A register val shud change; 