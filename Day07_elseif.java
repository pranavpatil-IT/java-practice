
import java.util.Scanner;


public class Day07_elseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age>56){
            System.out.println("you are experienced");
        }
        else if (age>46){
            System.out.println("you are semi experienced");
        }
        else if (age>40){
            System.out.println("you are ");
        }
        else {
            System.out.println("not experienced");
        }
    }
    
}
