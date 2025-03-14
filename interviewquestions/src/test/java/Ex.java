public class Ex {
    

    //  0 1 2 3 6 11

    private static void findFibanacci(int target, int increment)
    {
    for(int i=0; i<=target; i+=increment)
    {
        System.out.println(i);
    }
    


    }

    public static void main(String[] args) {
        
        findFibanacci(10, 3);
    }
    
}
