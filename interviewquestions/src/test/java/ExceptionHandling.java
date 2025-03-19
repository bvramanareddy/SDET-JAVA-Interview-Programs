

import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();
        try {
            int result = num/0;
        } catch (Exception e) {  //If we know what exception it is then we can add inplace of Exception
            System.out.println("Catching the Exception"+ e.getMessage());
        }
    }
}