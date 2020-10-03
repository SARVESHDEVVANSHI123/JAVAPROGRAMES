class Person1{
int age;
String name;

Person1(String str, int a){
name=str;
age=a;
}
void show(){
System.out.println("Name: "+name+" Age: "+age);
}
}
class Perobj1{
public static void main(String args []){
 Person1 p=new Person1("Abhi",20);  //Person p,ap;  Fruit apple, banana;
 Person1 ap=new Person1("SAR",19); //Fruit apple=new Fruit();    Fruit banana=new Fruit(apple);
p.show();
ap.show();
}
}