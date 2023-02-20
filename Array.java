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
    
    
    //Method for seperately summing numbers at even and odd indices
    //Returns a string stating which numbers are for even and odd indices
    public String indexSum(){
        int even = 0;
        int odd = 0;

        for (int i = 0; i < this.intArray.length; i++){
            if (i % 2 == 0){
                even += this.intArray[i];
            }
            else{
                odd += this.intArray[i];
            }
        }

        return "Sum of all even indices of the array is: " + even + "\nSum of all odd indices of the array is: " + odd;
    }
    
    // A method that finds and returns the minimum element of an array of integers
    public int minOfArray() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < this.intArray.length; i++) {
            if (this.intArray[i] < min) {
                min = this.intArray[i];
            }
        }
        return min;
    }

    // A method that finds and returns the maximum element of an array of integers
    public int maxOfArray() {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < this.intArray.length; i++) {
            if (this.intArray[i] > max) {
                max = this.intArray[i];
            }
        }
        return max;
    }
}
