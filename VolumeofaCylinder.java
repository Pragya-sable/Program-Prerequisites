
import java.util.*;
class VolumeofaCylinder{
public static void main(String args[]){
Scanner kb=new Scanner(System.in);
double radius=kb.nextDouble();
double height=kb.nextDouble();

double vol=3.14*radius*radius*height;
System.out.println("Volume of Cylinder is "+ vol);
}
}