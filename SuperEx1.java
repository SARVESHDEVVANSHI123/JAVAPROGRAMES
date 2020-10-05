class One{
int i=10;
void show(){
System.out.println("Parent class i="+i);
}
}
class Two extends One{
int i=20;
void show(){
System.out.println("Child class i="+i);
super.show(); //to invoke the imidiate parent class method.
System.out.println("Super Class i="+super.i); // to refer the imidiate parent class instance variable.
}
}
class SuperEx1{
public static void main(String ar[]){
Two o=new Two();
o.show();
}
}