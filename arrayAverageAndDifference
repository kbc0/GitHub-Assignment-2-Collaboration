import java.util.Arrays;

/*  
 *  This class takes an randomly assigned array and dedects how many numbers are there what is the sum.
 *  Also will set a code to return it incase it is needed. Lastly, we will find how far away these array
 *  numbers are from the average and print them out.
 */ 

class average {

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
            numberDistances[count] = Math.abs(number - averageOfNumbers);
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
