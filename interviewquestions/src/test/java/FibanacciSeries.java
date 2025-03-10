
public class FibanacciSeries {

    private static void fibanacciSeries(int number) {
        int first = 0;
        int second = 1;
        int third = 0;

        for (int i = 1; i <= number; i++) {
            third = first + second;
            System.out.print(first + " ");
            first = second;
            second = third;

        }
    }

    public static void main(String[] args) {
        int num = 8;
        fibanacciSeries(num);
    }
}
