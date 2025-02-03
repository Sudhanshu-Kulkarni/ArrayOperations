//Main.java
// Name : Sudhanshu Kulkarni
// PRN : 23070126132
// Batch : B3
class Main{
	public static void main(String args[]){
		UserInput in = new UserInput();
		ArrayFunctions functions = new ArrayFunctions();

		functions.oddEven(in.arrayInput());
		functions.min(in.arrayInput());
	}
}
