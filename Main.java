//Main.java
// Name : Sudhanshu Kulkarni
// PRN : 23070126132
// Batch : B3
class Main {
    public static void main(String args[]) {
        UserInput in = new UserInput();
        ArrayFunctions functions = new ArrayFunctions();

        // Accept user input
        int[] userArray = in.arrayInput();

        // Separate even and odd numbers
        functions.oddEven(userArray);

        // Find the minimum neighboring distance index
        functions.min(userArray);

        // Convert array to ArrayList and vice versa
        ArrayList<Integer> arrayList = functions.arrayToArrayList(userArray);
        System.out.println("Converted ArrayList: " + arrayList);

        int[] convertedArray = functions.arrayListToArray(arrayList);
        System.out.println("Converted back to Array: " + Arrays.toString(convertedArray));
    }
}