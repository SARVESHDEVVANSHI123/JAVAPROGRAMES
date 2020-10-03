/*-------'static' keyword--------
it is used for memory management.(variables, methods, blocks, nested class)

1. static variable:
    


*/
class Testvariable{
//  int x=5;
static int x=5;
void display(){
System.out.println(x);
}
}
class Testmethod{
static int x=5;
static void display(){
System.out.println(x);
}
}
class Demo{
public static void main(String args[]){
Testvariable obj1,obj2;
obj1=new Testvariable();
obj2=new Testvariable();
++obj1.x;
obj1.display();


++obj2.x;
obj2.display();
}
static{
int y=10;
Testmethod.display();
System.out.println("Static block."+y);
}
}