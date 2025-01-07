import java.util.*;
class PowerCalculation{
public static void main(String args[]){
Scanner kb=new Scanner(System.in);

       
        int base = kb.nextInt();
        int exponent = kb.nextInt();
         int result = Math.pow(base, exponent);

       
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);


}
}