import java.util.Random;

public class Array {
    // Given an array size, create an int array that contains random integers in the
    // range [0,100].
    // All the remaining functionality will operate on this array.
    Random rand = new Random();
    private int[] intArray;

    // constructor method
    public Array(int arraySize) {
        intArray = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            intArray[i] = rand.nextInt(101);
        }
    }

    // getter method
    public int[] getArray() {
        return intArray;
    }
    // TODO Menu options (i will design the menu according to your methods)

    public String toString() {
        String s = "";
        for (int i = 0; i < intArray.length; i++) {
            s += " " + String.valueOf(intArray[i]);

        }
        return s;
    }
}