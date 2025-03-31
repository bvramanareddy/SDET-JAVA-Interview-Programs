public class PowerOfANumberUsingRecurssion {
    
    public static int findThePowerOfNumberUsingRecurssion(int number, int power)
    {
        if (power ==0) {
            return 1; 
        }
        if (power==1) {
            return number;
        }
        
        return number * findThePowerOfNumberUsingRecurssion(number, power-1);
    }
    public static void main(String[] args) {
        
        int number = 5;
        int power = 2; 
        System.out.println(findThePowerOfNumberUsingRecurssion(number, power));
    }
}
