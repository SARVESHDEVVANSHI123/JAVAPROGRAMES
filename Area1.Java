//-------------------Method Overloading-------------------
//By changing data-types of arguments
class Area1{
//1
void calculate(int a, int b){
System.out.println("Area of Rectangle: "+(a*b));
}
//2
void calculate(float a, float b){
System.out.println("Area of Rectangle: "+(a*b));
}

public static void main(String [] args){
Area1 a=new Area1();
a.calculate(4,6);
a.calculate(4.2f,6.5f); //10.0f
}
}