/*--------Single Inharitance--------*/
//class child-class_name extends parent-class_name
class Animal{  
void eat()
{
System.out.println("eating...");
}  
}  
class Dog extends Animal{  
void bark()
{
System.out.println("barking...");
}  
}  
class SingleIn{  
public static void main(String args[]){  
Dog d=new Dog();  
d.eat(); 
d.bark();  
 
}}