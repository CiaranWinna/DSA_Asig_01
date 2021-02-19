/*
 * Student name:Ciaran Winnan
 *
 * Student number:2940836
 
 */
import java.util.*; 
public class Assignment1_2018{
	public static void main(String args[]){
	  //test print
		print(3,6);
		//========================================
		//test sum
		System.out.println("\n\n" + sum(1,10));
		//========================================
		//test printBinary
		printBinary(55);
		System.out.println("");
		printBinary(11);
		//========================================
	}
	static void print(int a, int b){ //assume a <= b
		if(a < b){
			System.out.print(a);
			print(a+1,b);
		}
		else{
			System.out.print(b);
		}
	}
		
	
	static int sum(int a, int b){
		if(a == b){
			return a;
		}
		else{
			return getSum(a, a+1, b);
		}
	}
	
	static int getSum(int a, int a0, int b){
		if(a0 == b) return a+b;
		else{
			return(getSum(a+a0, a0+1, b));
		}
	}


	static void printBinary(int x){
		if(x > 1){
			printBinary(x/2);
		}
		if(x % 2 == 0){
			System.out.print(0);
		}
		else{
			System.out.print(1);
			x--;
		}
			
	}
}