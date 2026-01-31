import java.util.stream.IntStream;

/**
 * @author Jon Mrowczynski
 */
public class JavaFUNdamentals { // TODO: Looking at this class, what was not followed? Can you fix it?

    public static void main(String[] args) {
        part1();
        part3(part2());
    }

    private static void part1() {
        System.out.println("\nPart 1 (12pts) :\n");

        // TODO: (1pt) Create a Scanner object that reads input from the console.
        Sanner scanner;

        // TODO: (2pts) Ask the user how many integers they will enter and store that in a constant.
        //  Assume that only a valid integer will be entered.

        // TODO: (1pt) Create an array of that many integers.

        // TODO: (4pts) Ask the user to enter their integers and store them in the array. 
        //  Assume that only valid integers will be entered.

        scanner.close(); // Make sure to close any resources that you opened once you are done with them!

        // TODO: (4pts) Calculate and print the average value of the array.
    }

    private static int[] part2() {
        System.out.println("\nPart 2 (12pts):\n");

        // TODO: (1pt) Create a new Random object and store a reference to it.

        // TODO: (4pts) Create an array of 30 random integers whose values range between 0 and 15 inclusive.
        //  Ensure this function returns this array.

        // TODO: (1pt) Print the contents of the array.

        // TODO: (1pt) Sort your array.

        // TODO: (1pt) Print your array again like above to make sure that it is sorted.

        // TODO: (1pt) Generate a random int between 5 and 10 inclusive and store that result in a constant.

        // TODO: (3pts) Using an indexed-for loop, print the index of the first number in your array greater than the random int.
        //  Can you do so without iterating over the entire array?

        return new int[0]; // TODO: This will need to be changed.
    }

    private static void part3(int[] ints) {
        System.out.println("\nPart 3 (5pts):\n");

        System.out.print("[");

        // TODO: (5pts) For each value in your array:
        //  Print it if it's between 5 and 10 inclusive.
        //  Do not print it if it's 7.
        //  Print it if it's value is 0 or 15.
        //  If you are printing the value, then print the value with a ", " after the value
        //  Don't worry about the extra comma and space that is printed at the end of the array.

        System.out.println("]");

        // ??? What is going on here???
        var something = IntStream.range(0, 49).mapToDouble(Math::sqrt).filter(d -> d == (int) d).toArray();
    }
}