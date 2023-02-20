import java.util.Random;

public class Array {
    // Given an array size, create an int array that contains random integers in the
    // range [0,100].
    // All the remaining functionality will operate on this array.
    Random rand = new Random();
    private int[] intArray;

    //constructor method
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

    // Implementions
    private double averageOfNumbers;
    private Integer[] assignedNumberArray;
    private Double[] numberDistances;

    // Constructor of the Class
    public average(Integer[] numbers) {
        this.assignedNumberArray = numbers;
        this.numberDistances = new Double[assignedNumberArray.length];
    }

    // Firstly, we need to find the average of our array.
    public void setAverage() {

        // Some variables that will be useful later:
        double numberSum = 0;

        // Let's find the count of numbers and their sums.
        for (Integer number : assignedNumberArray) {
            numberSum += number;
        }

        //Lastly, calculate the average.
        this.averageOfNumbers = numberSum / assignedNumberArray.length;
    }

    // Return the average incase we need it.
    public double getAverage() {
        return averageOfNumbers;
    }

    // We will find how far off each number is from the average.
    public void setDistance() {
        // We will be adding a counter to determine which element we are in the element at the moment.
        int count = 0;
        for (Integer number : assignedNumberArray) {
            numberDistances[count] = number - averageOfNumbers;
            count++;
        }
    }

    // Returning a number of array which indicates the distance from the
    // average for each number in the assigned array.
    public Double[] getDistance() {
        return numberDistances;
    }

    // Lastly, we will print the distances.
    public String toString() {
        return Arrays.toString(numberDistances);
    }
}
