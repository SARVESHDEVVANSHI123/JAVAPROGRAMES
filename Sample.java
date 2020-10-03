//----this keyword-------
//is used to refer the current/present class object    (instance variables, methods, constructors)
/*
1. To access the current class instance variable
2. To invoke the current class method
3.1. To  invoke the current class constructors( call parameterized const. from Default const.)
3.2. To  invoke the current class constructors( call default const. from parameterized const.)
*/


class Sample{
private int x;  //x is a private instance variable.

Sample(){
this(50);  //3.1.call current class parameterized constructor 
this.show();   //2.call current class show()
} 
Sample(int x){
this.x=x;    //1.refer current class instance variable.
}

//method
void show(){
System.out.println("X: "+x);
}

public static void main(String [] args){
Sample s= new Sample();
}
}