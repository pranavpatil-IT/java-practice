
public class Day04operator_presedence {
    public static void main(String[] args) {
        int a = 6*5-34/2;
        // higest precedence goes to * and / . evaluated on the basis of left to right associativity.

        int b = 60/5-34*2;
        System.out.println(a);
        System.out.println(b);

        //quick quiz

        int x=6; 
        int y=1;
        int k= x * y/2;
        System.out.println(k);

    }
    
}
