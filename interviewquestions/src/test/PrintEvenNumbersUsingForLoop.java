public class PrintEvenNumbersUsingForLoop {

    public static void printOnlyEvenNumberUsingForLoop(int range) {
        for (int i = 0; i <= range; i = i += 2) {
            System.out.println("Printing Only Even Numbers is " + i);
        }
    }

    public static void main(String[] args) {
        int range = 20;
        printOnlyEvenNumberUsingForLoop(range);
    }
}
