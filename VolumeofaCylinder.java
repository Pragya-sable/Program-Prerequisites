
import java.util.*;
class VolumeofaCylinder{
public static void main(String args[]){
Scanner kb=new Scanner(System.in);
int radius=kb.nextInt();
int height=kb.nextInt();

double vol=3.14*radius*radius*height;
System.out.println("Volume of Cylinder is "+ vol);
}
}