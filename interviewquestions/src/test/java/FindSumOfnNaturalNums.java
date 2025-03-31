public class FindSumOfnNaturalNums {
    
    public static int findSumOfnNaturalNumsRecussion(int number)
    {
        if (number ==1) {
            return 1;
        }
        return number + findSumOfnNaturalNumsRecussion(number-1);
    }
    public static int findSumOfNumberIterative(int n)
    {
        int sum=0;
        for(int i=0; i<=n; i++)
        {
            sum+=i;
        }
        return sum;
    }
    public static int findSumOfNumberUsingFormula(int n)
    {
        
        return (n * (n+1))/2;
       
    }
    public static void main(String[] args) {
        
        int number =5;
        System.out.println(findSumOfNumberIterative(number));
        System.out.println(findSumOfNumberUsingFormula(number));
        System.out.println(findSumOfnNaturalNumsRecussion(number));
    }
}
