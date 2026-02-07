// write a java program to convert a string to lowercase.
/*
public class Day06_practiceset3 {
    public static void main(String[] args) {
        String name = "Pranav Patil";
        name = name.toLowerCase();
        System.out.println(name);
    }
    
}
*/

//write a java program to replace spaces with underscore 
/*
public class Day06_practiceset3 {
    public static void main(String[] args) {
        String text = "TO lower case";
        text =text.replace(" ","_");
        System.out.println(text);
    }
}
*/

//problem 3
/*
public class Day06_practiceset3 {
    public static void main(String[] args) {
        String name ="Dear <|name|>, thank a lot!";
        name = name .replace("<|name|>", "pranav");
        System.out.println(name);
    }
}
*/

//problem 4 
/* 
public class Day06_practiceset3 {
    public static void main(String[] args) {
        String myString = "this string contain  double and triple space ";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));
    }
}
*/

//problem 5
public class Day06_practiceset3 {
    public static void main(String[] args) {
        String myletter = "dear pranav , \n\t this java course is nice ,\n\t thanks! ";
        System.out.println(myletter);
    }
}