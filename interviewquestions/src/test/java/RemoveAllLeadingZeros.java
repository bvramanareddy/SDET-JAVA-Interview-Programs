public class RemoveAllLeadingZeros {
    
    private static String removeAllLeadingZeros(String string)
    {
      return  string.replaceAll("^0+(?!$)", "");
    }
    public static void main(String[] args) {
        System.out.println(removeAllLeadingZeros("00012Reddy780"));
    }
}
