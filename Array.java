import java.util.Random;
import java.util.Scanner;

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
        average average = new average(array.getArray());
        int userChoice = 0;
        average.setAverage();
        average.setDistance();
        
        while( userChoice !=5 )
        {
        //getting input from user to choose operation
            System.out.println("1 - Find the maximum value in the array");
            System.out.println("2 - Find the minimum value in the array");
            System.out.println("3 - Display how each element of the array differs from the average.");
            System.out.println("4 - Find the sum of elements with odd- and even-numbered indexes.");
            System.out.println("5 - Exit");
            System.out.print("Please choose operation :");
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
                System.out.println("Each element of the array differs from the average as" + average);
            }
            else if (userChoice == 4)
            {
                System.out.println(array.indexSum());
            }
        }
        


        
    }
}
