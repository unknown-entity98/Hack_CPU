import java.util.*;
public class program_counter extends one_bit{
	/*remember to initialize the first input, but what if you're running it again though?
	 * first initialization is -> FB = "0000000000000000"; but it actually represents the previous input...*/
	  static String PC(String FBout,String a,int load,int inc,int reset){   //5 inputs, rather than conventional 4
	  String stage1 = MUX16(FBout,Inc(FBout),inc);
	  String stage2 = MUX16(stage1,a,load);
	  FBout = MUX16(stage2,"0000000000000000",reset);
	  return FBout;
	  } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		//taking the 5 inputs
		System.out.print("what is the previous output? (if this is the 1st time you're running, it is 0000000000000000)");
		String prev_output = in.next();
		System.out.print("Please enter the input instruction: ");
		String input_pc = in.next();
		System.out.print("Enter the load input here: ");
		int ld = in.nextInt();
		System.out.print("Enter the increment bit here: ");
		int inc = in.nextInt();
		System.out.print("Enter the reset input here: ");
		int reset = in.nextInt();
		//putting them to work now
		String output_pc = PC(prev_output,input_pc,ld,inc,reset);
		System.out.println("the instruction you chose(or that should run now is) is: "+output_pc);
	}
}
