import java.util.*;
public class mux16 extends incrementor{
	static String MUX16(String a,String b,int load) {
		if(load == 1) {return b;}
		else {return a;}
	}
	/*static String DEMUX(){
	* this should take 1 input,n selection bits -> gives 2^n output lines
	*}
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("One input is: ");
		String x = in.next();
		System.out.print("Second input is: ");
		String y = in.next();
		System.out.print("selection bit is: ");
		int l = in.nextInt();
		//inputs taken
		String output_mux = MUX16(x,y,l);
		System.out.println("the output is: -> "+output_mux);
	}

}
