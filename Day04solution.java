
import java.util.Scanner;

//write a program to calculate percentage of a given student in cbse board exam .his marks from 5 subject 
// must be taken as input from the keyboard (marks are out of 100)


public class Day04solution {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner sc= new Scanner(System.in);

        System.out.println("enter 1 sub marks");
        float m1 = sc.nextFloat();
        System.out.println("enter 2 sub marks");
        float m2 = sc.nextFloat();
        System.out.println("enter 3 sub marks");
        float m3 = sc.nextFloat();
        System.out.println("enter 4 sub marks");
        float m4 = sc.nextFloat();
        System.out.println("enter 5 sub marks");
        float m5 = sc.nextFloat();

        float per=(m1+m2+m3+m4+m5)*100/500;
        System.out.println(per);


    }
    
}
