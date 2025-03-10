public class FactorialLoop {
    
    private static int findFactorial(int number)
    {
        int factorial =1; 
        for (int i=1; i<=number; i++)
        {
            factorial= factorial * i;
        }
        return factorial;
            
        }
        public static void main(String[] args) {
            int num=5;
            System.out.println("Factorial of "+ num+ " is "+ findFactorial(num));
        }
    }

