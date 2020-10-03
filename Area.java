//-------------------Method Overloading-------------------
//By changing number of parameters
class Area{
//1
void calculate(int a, int b){
System.out.println("Area of Rectangle: "+(a*b));
}
//2
void calculate(int a, int b,int c){
System.out.println("Area of cube: "+(a*b*c));
}

public static void main(String [] args){
Area a=new Area();
a.calculate(4,6);
a.calculate(4,2,6);
}
}