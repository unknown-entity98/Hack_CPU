import java.util.*;
public class alu extends program_counter{
	
	 static String[] ALU(String input1,String input2,int zx,int nx,int zy,int ny,int f,int no){ 
	  String stage1 = MUX16(input1,"0000000000000000",zx);
	  String stage1_int1 = MUX16(stage1,NOT16(stage1),nx);
	  
	  String stage2 = MUX16(input2,"0000000000000000",zy); 
	  String stage2_int1 = MUX16(stage2,NOT16(stage2),ny);
	  String mid_stage1 = AND16(stage2_int1,stage1_int1);
	  String mid_stage2 = convertToString(ADD16(stage2_int1,stage1_int1));
	  
	  String evolving_stage = MUX16(mid_stage1,mid_stage2,f);
	  String out_alu = MUX16(evolving_stage,NOT16(evolving_stage),no); //now I have to do 2 Or8Way's do check if its zero,negative or positive
	  
	  String a1[] = out_alu.split("");
	  //works well
	  int ar3[] = new int [8];    //remember: this array goes from right to left in String(java convention) while in hdl you need last bit from right to left
	  for(int j = 0;j < 8;j++) {ar3[j] = Integer.parseInt(a1[j]);}//converting string input to char array, then int array, then to another string ->just so I could evaluate these in Or8Way
	  int ar4[] = new int [8];
	  for(int j = 8;j < 16;j++){ar4[j-8] = Integer.parseInt(a1[j]);}
	  //took the two halves as 8bit integer arrays; now will convert them to string
	  String new_case1 = convertToString(ar3);
	  String new_case2 = convertToString(ar4);//now I have both the strings ready
	  String new_case3 = Or8Way(new_case1);
	  String new_case4 = Or8Way(new_case2); //I have to OR these 1bit string -> they're either 0 or 1; when I OR them, I'll get a boolean value, so need to make that an int
	  int notzr = (OR(toBoolean(Integer.parseInt(new_case3)),toBoolean(Integer.parseInt(new_case4))))?1:0;
	  int zr = (NOT(toBoolean(notzr)))?1:0; //obtained the desired zr value
	  int ng = ar3[0];
	  String returning_output_alu[] = {out_alu,String.valueOf(ng),String.valueOf(zr)};
	  return returning_output_alu;
	 }   
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String a = "1";
		int val = Integer.parseInt(a);
		System.out.print("Please give the x input");
		String x = in.next();
		System.out.print("Please give the y input");
		String y = in.next();
		System.out.print("Please give the zx control bit");
		int zx = in.nextInt();
		System.out.print("Please give the nx control bit");
		int nx = in.nextInt();
		System.out.print("Please give the zy control bit");
		int zy = in.nextInt();
		System.out.print("Please give the ny control bit");
		int ny = in.nextInt();
		System.out.print("Please enter the f bit");
		int f = in.nextInt();
		System.out.print("Please enter the no bit");
		int no = in.nextInt();
		//have taken the inputs. now have to receive the outputs(which will come in a string array)
		String[] cri = ALU(x,y,zx,nx,zy,ny,f,no);
		System.out.println("out : -> "+cri[0]);
		System.out.println("ng bit: "+cri[1]);
		System.out.println("zr bit: -> "+cri[2]);
	}

}
