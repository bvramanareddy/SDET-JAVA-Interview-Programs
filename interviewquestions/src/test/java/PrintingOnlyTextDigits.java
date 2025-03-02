public class PrintingOnlyTextDigits {
    
    public static void main(String[] args) {
        String accNumber = "52163626442HDFC";
        String onlyText= accNumber.replaceAll("[^a-zA-Z]", "");
        String onlyAccNum= accNumber.replaceAll("[^0-9]", "");
       long accNum=  Long.parseLong(onlyAccNum);
        System.out.println("ExtactedOnlyTextString "+onlyText);
        System.out.println("ExtractedOnlyNumberFromString "+accNum);

    }
    

}
