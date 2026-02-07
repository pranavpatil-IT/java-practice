//what will be the result of the following expression float a=7/4*9/2
/* 
public class Day05practicese2 {
    public static void main(String[] args) {
        float a = 7/4.0f * 9/2.0f;
        System.out.println(a);
    }
    
}*/

// write a java program to encrypt a grade by adding 8 to it . decrypt it to show the correct grade.
/*
public class Day05practicese2 { 
    public static void main(String[] args) {
       char grade = 'b';
       grade =(char)(grade+8);
        System.out.println(grade);

        //decrypting the grade
        grade = (char)(grade-8);
        System.out.println(grade);
    }
    
}
*/

//use comparison operators to find out whether a given number is greator. than the user entered or not .

import java.util.Scanner;

public class Day05practicese2 {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      int a = sc.nextInt();
      System.out.println(a>8);
    }
}