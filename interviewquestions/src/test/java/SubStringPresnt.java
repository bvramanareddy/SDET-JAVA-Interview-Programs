public class SubStringPresnt {
    
    private static void checkSubStringPresent(String mainString, String subString)
    {
       int index=  mainString.indexOf(subString);
       if(index!=-1)
       {
        System.out.println("The subString found at "+ index);
       }
       else
       {
        System.out.println("SubString not present");
       }
    }
    private static void findSubString(String mainString, String subString)
    {
        if (mainString.contains(subString)) {
            System.out.println("SubString present in Main String");
            
        }
        else
        {
            System.out.println("SubString is not present in Main String");
        }
    }
   
    public static void main(String[] args) {
        String s= "Hi my name is Ramana Reddy";
        String ss= "Ramana";
        checkSubStringPresent(s, ss);
        findSubString(s, ss);
    }
}
