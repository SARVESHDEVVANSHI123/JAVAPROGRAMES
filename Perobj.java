class Person{
 String name;
 int age;
//1 Default Constructor
 Person( ){
   name="RAM";
   age=45; 
 }
//2 Parameterized Constructor with more parameters
 Person(int x,int y,String opr){
  switch(opr){
	case "Add":
	    System.out.println(opr+" of "+x+" & "+y+": "+(x+y));
	    break;
	case "Mul":
	    System.out.println(opr+" of "+x+" & "+y+": "+(x*y));
	    break;
 }
}
//3 Parameterized Constructor with one parameter
 Person(Person a){
  name=a.name;  //x=y; y=z =>x=z
  age=a.age;    // a=p p.name="Ram" =>a.name="Ram"    name=a.name
}

void show(){
System.out.println("Name: "+name+" Age: "+age);
}
}
class Perobj{
public static void main(String args []){
 Person p=new Person();  //Person p,ap;  Fruit apple, banana;
 Person ap=new Person(p); //Fruit apple=new Fruit();    Fruit banana=new Fruit(apple);
p.show();
ap.show();
}
}