import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;


public class Array {
    // Given an array size, create an int array that contains random integers in the
    // range [0,100].
    // All the remaining functionality will operate on this array.
    Random rand = new Random();
    private int[] intArray;

    private double averageOfNumbers;
    private double[] numberDistances;

    // constructor method
    public Array(int arraySize) {
        intArray = new int[arraySize];
        this.numberDistances = new double[intArray.length];
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

    // Finding and returning the average of the array.
    public double getAverage() {

        // Some variables that will be useful later:
        double numberSum = 0;

        // Let's find the count of numbers and their sums.
        for (Integer number : intArray) {
            numberSum += number;
        }

        // Lastly, calculate the average.
        this.averageOfNumbers = numberSum / intArray.length;

        return this.averageOfNumbers;
    }


    // Returning a number of array which indicates the distance from the
    // average for each number in the assigned array.
    public double[] getDistance() {
        // We will be adding a counter to determine which element we are in the element
        // at the moment.
        int count = 0;
        for (Integer number : intArray) {
            this.numberDistances[count] = number - this.getAverage();
            count++;
        }
        
        return this.numberDistances;
    }
    
    // Printing the distances.
    public String distanceToString() {
        return Arrays.toString(this.getDistance());
    }

    // Method for seperately summing numbers at even and odd indices
    // Returns a string stating which numbers are for even and odd indices
    public String indexSum() {
        int even = 0;
        int odd = 0;

        for (int i = 0; i < this.intArray.length; i++) {
            if (i % 2 == 0) {
                even += this.intArray[i];
            } else {
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
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        //getting input from the user to determine array size
        System.out.print("input an array size between 0-100  : ");
        int arraySize = in.nextInt();
        in.nextLine();
        //creating array with array constructor
        Array array = new Array(arraySize);
        System.out.println("Your randomized array is  {" + array + " }");
        //creating average 
        int userChoice = 0;
        
        while( userChoice !=5 )
        {
        //getting input from user to choose operation
            System.out.println("1 - Find the maximum value in the array");
            System.out.println("2 - Find the minimum value in the array");
            System.out.println("3 - Display how each element of the array differs from the average.");
            System.out.println("4 - Find the sum of elements with odd- and even-numbered indexes.");
            System.out.println("5 - Exit");
            System.out.print("Please choose operation : ");
            userChoice = in.nextInt();
            in.nextLine();

            if(userChoice == 1)
            {
                System.out.println("Maximum value in the array is " + array.maxOfArray());
            }
            else if(userChoice == 2)
            {
                System.out.println("Minimum value in the array is " + array.minOfArray());
            }
            else if (userChoice == 3)
            {
                System.out.println("Average of the array is " + array.getAverage() + " and each element of the array differs from the average as " + array.distanceToString());
            }
            else if (userChoice == 4)
            {
                System.out.println(array.indexSum());
            }
        }
        
    }
}
