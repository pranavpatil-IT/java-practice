

public class Day05_StringMethod {
    public static void main(String[] args) {
    String name = "Pranav";
   // System.out.println(name);

    int value = name.length();
    System.out.println(value);
    
    String lString = name.toLowerCase();
    System.out.println(lString);
    
    String uString = name.toUpperCase();
    System.out.println(uString);
    
    String nontrimmedString= "   pranav. ";
    System.out.println(nontrimmedString);

    System.out.println(name.substring(4));

     System.out.println(name.substring(2,6));

     System.out.println(name.replace('r','s'));
          System.out.println(name.replace("nav","tya"));
    
     System.out.println(name.startsWith("Pr"));
     System.out.println(name.endsWith("da"));

     System.out.println(name.charAt(1));

     System.out.println(name.indexOf("a"));
     System.out.println(name.lastIndexOf("av"));

     System.out.println(name.equals("Pranav"));
     System.out.println(name.equalsIgnoreCase("PranAv"));


}
}
