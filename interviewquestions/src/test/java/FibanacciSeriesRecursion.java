public class FibanacciSeriesRecursion {

    private static int fibanacciSeriesRecursion(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        return fibanacciSeriesRecursion(n - 1) + fibanacciSeriesRecursion(n - 2);

    }

    public static void main(String[] args) {

        int num = 10;
        for (int i = 0; i <= num; i++) {
            System.out.print(fibanacciSeriesRecursion(i)+ " ");
        }

    }

}
