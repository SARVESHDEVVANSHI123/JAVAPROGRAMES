//How to access the instance variables?
class Animal1{
int weight;
String name;
}

class Animal{
public static void main(String args[]){
//classname refernce_variable=new classname();

Animal1 a=new Animal1();

a.name="Lion";
a.weight=50;

a.name="DOG";
a.weight=20;
System.out.println(a.name);
System.out.println(a.weight);

System.out.println(a.name);
System.out.println(a.weight);
}
}