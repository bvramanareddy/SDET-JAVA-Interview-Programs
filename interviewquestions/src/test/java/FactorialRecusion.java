public class FactorialRecusion {
    
    private static int factorial(int number)
    {
        if (number==0 || number ==1)
        {
            return 1;
        }
        else
        {
            return number * factorial(number-1);
        }
    }
    public static void main(String[] args) {
        
        int num =4;
        System.out.println("Factorial of " +num+ " is " + factorial(num));
    }
}
