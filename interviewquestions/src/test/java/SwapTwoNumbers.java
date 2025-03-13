public class SwapTwoNumbers {
    
    private static void swapTwoNumbers(int a,  int b)
    {

        System.out.println("Values before swapping are a, b "+ a +  ", " + b);
        int c=a;
        a = b;
        b = c;
        c = a;
       
        System.out.println("Values After swapping are a, b "+ a +  ", " + b);

    }
    public static void main(String[] args) {
        
        int a = 111;
        int b =222; 

        swapTwoNumbers(a, b);
    }
}
