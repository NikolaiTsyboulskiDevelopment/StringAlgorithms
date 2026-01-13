public class StringAlgorithms {
    private static boolean a;
    public static String printCharacters(String word){
        int num = word.length();
        for (int p = 0; p < num; p++) {
           System.out.println(word.substring(p,p+1));
           
        }
        return "";
    }
     public static String reverseWord(String word) {
        int num = word.length();
        for (int p = 0; p < num; num--) {
           System.out.print(word.substring(num-1,num));
        }
        return "";
    }
    public static String firstUniqueChar(String word){
      int i = 0;
      while (i < word.length()) {
         String c = word.substring(i, i + 1);
         if (word.indexOf(c) == word.lastIndexOf(c)) {
              System.out.println(c);
              i += 4000;
              }
         i++;
     
    }
    return " ";    
    
    }
    public static String capitalizeString(String sentence) {
      String result = "";
      int i = 0;
      while (i < sentence.length()) {
         while (i < sentence.length() && sentence.substring(i, i + 1).equals(" ")) {
         result += " ";
         i++;
         }
         if (i < sentence.length()) {
                     
         result += sentence.substring(i, i + 1).toUpperCase();
         i++;
         }          
         while (i < sentence.length() && !sentence.substring(i, i + 1).equals(" ")) {
            result += sentence.substring(i, i + 1);
            i++;
            
         }
      }
      System.out.println(result);
      return "";
    }
    public static String detectPalindrome(String word) {
      public static String pitorWord(String word) {
        int num = word.length();
        for (int p = 0; p < num; num--) {
           System.out.print(word.substring(num-1,num));
        }
        return "";
                              
        System.out.print(word.equals(reversed));
      return "";
    }
    
    public static void main(String[] args) {
        System.out.println("Testing printCharacters:");
        printCharacters("hello");
        System.out.println("Testing reverse word:");
        reverseWord("madam");
        System.out.println("\nTesting detectPalindrome:");
        detectPalindrome("madam");
        System.out.println("\nTesting capitalizeString:");
        capitalizeString("the cat is bothering me");
        System.out.println("\nTesting firstUniqueChar:");
        firstUniqueChar("rapper");
        // i got all except detect palindrome it sucks
        
        
    }
}
