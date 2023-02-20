public class testMain {
    public static void main(String[] args) {
        Array test = new Array(5);

        int[] testArray = test.getArray();
        for (int element : testArray) {
            System.out.print(" " + element);
        }

        System.out.println("\n" + test.indexSum());
        System.out.println(test.maxOfArray());
        System.out.println(test.minOfArray());

        average testAv = new average(testArray);
        testAv.setAverage();
        testAv.setDistance();
        System.out.println(testAv.toString());
    }
}
