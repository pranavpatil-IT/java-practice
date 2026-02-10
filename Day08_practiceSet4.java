
import java.util.Scanner;


/*
public class Day08_practiceSet4 {
    public static void main(String[] args) {
        int a = 11;
        if(a==10){
            System.out.println("i am 10 ");
        }
        else{
            System.out.println("i am not 10");
        }
    }
    
}
*/

//problem 2.
/*
public class Day08_practiceSet4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your english marks ");
        byte m1 = sc.nextByte();

        System.out.println("enter your chemistry marks ");
        byte m2 = sc.nextByte();

        System.out.println("enter your mathematics marks");
        byte m3 = sc.nextByte();

        float avg = (m1+m2+m3)/3.0f;
        System.out.println("your overall percentage is "+ avg);
        if (avg >=40 && m1>=33 && m3>=33){
            System.out.println("congratulations,you have been promoted ");
        }
        else{
            System.out.println("sorry you have been not promoted ");
        }
    }
}
*/

//Question 3

public class Day08_practiceSet4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("enter your income in lakh");
        float tax = 0;
        float income = sc.nextFloat();
        if(income<2.5){
            tax = tax + 0;
        }
        else if(income > 2.5f && income <= 5f){
            tax = tax + 0.05f * (income - 2.5f);
        }
        else if (income >5f && income<10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
             tax = tax + 0.05f * (income - 5f);
     
       }
        else if (income>10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5f);
             tax = tax + 0.03f * (income - 2.5f);
        }
        System.out.println("tax paid "+ tax);
    }
}