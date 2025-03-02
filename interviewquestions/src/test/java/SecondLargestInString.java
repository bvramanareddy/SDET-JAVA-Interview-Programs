import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class SecondLargestInString {
    
    private static int findSecondLargestFromString(String s)
    {
        HashSet<Integer>  set =  new HashSet<>();
        for(char c: s.toCharArray())
        {
            if(Character.isDigit(c))
            {
                set.add(Character.getNumericValue(c));
            }
        }
        ArrayList<Integer> list =  new ArrayList<>(set);
        Collections.sort(list);
        int secLargest = list.get(list.size()-2);
        return secLargest;
    }

    public static void main(String[] args) {
        
        String name = "Ram1256Red9Y7";
System.out.println(findSecondLargestFromString(name));    }
}
