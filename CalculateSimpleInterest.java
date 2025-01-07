import java.util.*;
class CalculateSimpleInterest{
public static void main(String args[]){
Scanner kb=new Scanner(System.in);
int p=kb.nextInt();
int r=kb.nextInt();
int t=kb.nextInt();
int SI=(p*t*r)/100;


System.out.println("SI is "+ SI);
}
}