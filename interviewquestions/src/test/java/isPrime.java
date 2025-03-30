public class isPrime {
    
    private static Boolean isPrime(int num)
    {
        for(int i=2; i<Math.sqrt(num); i++)
        {
            if (num%i==0) 
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int number = 5;
        System.out.println(isPrime(number));
        System.out.println(isPrime(6));
    }
}
