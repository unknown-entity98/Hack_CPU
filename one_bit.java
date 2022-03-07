import java.util.*;
public class one_bit extends mux16{
	//stores a value until instructed to change it
	 static String DFF(String a) {
	 String dff_value = a;
	 return dff_value; //the purpose here is to store (and return the value stored)
	 } 
	 static String ONE_BIT(String val_in,String a,int load){
		 //what's the error here? okay.. it had to be initialized. so i gave zero. Hopefully this works
		 String t = val_in;
		 String stage1 = MUX16(t,a,load);
		 t = DFF(stage1);
		 return t;
	 }
	public static void main(String[] args) {
		//here is the main code
		Scanner in = new Scanner(System.in);
		System.out.print("What is the input you're giving here? -> ");
		String x = in.next();
		System.out.print("do you want to load this input into the Bit?[1-yes 0-no] ");
		int y = in.nextInt();
		System.out.print("what is the pre-existing value in the DFF? (if you're running it for first time, giving 0s)-> ");
		String pre_value = in.next();
		//putting these variables to work
		String output_bit = ONE_BIT(pre_value,x,y);
		System.out.println("The output be: "+output_bit);
	}
}
