import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class FindTheDigitsToSumUptoTarget {
    
    private static int[] findTheDigitsThatSumUptoTarget(int[] numbers, int target)
    {
        
        int[] result=  new int[2];
        
        HashMap<Integer, Integer> map =  new HashMap<>();

        for(int num: numbers)
        {
            int complement =target-num;
            if(map.containsKey(complement))
            {
                result[0]= map.get(complement);
                result[1]= num;
                return result;
            }
            map.put(num, num);
        }

           
        
        return result;
        }
        public static void main(String[] args) {


            int[] nums= {1,2,3,4,5,6};
            int target= 11;
           int[] result = findTheDigitsThatSumUptoTarget(nums, target);
           System.out.println(Arrays.toString(result));

            
        }
    }
    