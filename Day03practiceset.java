
import java.util.Scanner;

//add three integer number .

/* public class Day03practiceset{
    public static void main(String[] args) {
        int a = 45;
        int b = 33;
        int c = 23;
        int sum = a+b+c;
        System.out.println(sum);
    }
}
    */
 

//write a program to calculate cgpa using marks of three subjects(out of 100)

/*public class Day03practiceset{
    public static void main(String[] args){
        float subject1 = 54;
        float subject2 = 65;
        float subject3 = 74;
        float cgpa = (subject1 + subject2 + subject3)/30;
        System.out.println(cgpa);

    }
}*/


//write a java program which ask user to enter his name and greet them with hello <name>,have a good day text 

/* public class Day03practiceset{
    public static void main(String[] args){
        System.out.println("what is your name ");
        Scanner sc=new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello" + name + "have a good day");

    }
} */


// write a java program to detect whether a number entered by the user is integer or not.

public class Day03practiceset{
    public static void main(String[] args){
        System.out.println("enter your number ");
        Scanner sc=new Scanner(System.in);
        System.out.println(sc.hasNextInt());
       
    }
}