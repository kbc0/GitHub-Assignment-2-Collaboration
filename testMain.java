public class testMain {
    public static void main(String[] args) {
        Array test = new Array(5);
        int[] testArray = test.getArray();
        System.out.println(test.toString());
        for (int element : testArray) {
            System.out.print(" " + element);
        }
    }
}
