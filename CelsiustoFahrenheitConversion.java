
import java.util.*;
class CelsiustoFahrenheitConversion{
public static void main{String args[]){
Scanner kb=new Scanner(System.in);
double cel=kb.nextDouble();
double ferh=(cel*9/5)+32;
System.out.println("Temperature is " +ferh);
}
}