

public class SumOfDigitsOfGivenNumber {
    
    private static int findTheSumOfDigitsofGivenNumber(int number)
    {
        // inout 1234 =>output  1+2+3+4 ->10 
        int sumOfDigits = 0; 
        
        while (number>0) {
            int singleDigit = number%10;
            sumOfDigits = sumOfDigits + singleDigit;
            number =number/10; 
            
        }
        return sumOfDigits;
    }

    public static void main(String[] args) {
        int number =1234;
        System.out.println("Sum of Digits of given number " + number + " is " +findTheSumOfDigitsofGivenNumber(number));
    }
}
