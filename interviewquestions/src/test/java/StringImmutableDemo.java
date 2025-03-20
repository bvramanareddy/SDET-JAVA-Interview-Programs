public class StringImmutableDemo {
    public static void main(String[] args) {
        String str = "Hello";  // Original string
        System.out.println("Original String: " + str);
        
        str.concat(" World");  // Attempt to modify the string
        System.out.println("After concat: " + str);  // Still "Hello", proving immutability
        
        str = str.concat(" World"); // Assigning new value
        System.out.println("After reassignment: " + str); // Now "Hello World"
        System.out.println("Getting the ID of String " + System.identityHashCode(str));
    }
}
