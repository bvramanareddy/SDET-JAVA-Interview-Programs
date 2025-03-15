import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.List;

public class StreamsExperiment {
    
    public static void main(String[] args) {
        
        Map<String, Double>  salaryMap =  new HashMap<>();
        salaryMap.put("Ramana", 10002.00);
        salaryMap.put("SAnju", 23900.00);
        salaryMap.put("Raju", 8988.00);
        salaryMap.put("Mahesh", 7887.00);

        System.out.println(salaryMap);

        List<String>  salaryAbove10K= salaryMap.entrySet().stream().filter(e->e.getValue()>10000).map(Map.Entry::getKey).collect(Collectors.toList());

        System.out.println("Printing the Employess with above 10K Salary");
        System.out.println(salaryAbove10K);
    }
}
