class One{
One(){
System.out.println("One class");
}
One(int i){
System.out.println("One class i="+i);
}
}
class Two extends One{
Two(){
	//super();// to invoke the imidiate parent class default constructor.
	//super(5);// to invoke the imidiate parent class parameterised constructor.
System.out.println("Two class");
}
}
class Three extends Two{
Three(){
	//super();// to invoke the imidiate parent class default constructor.
	//super(5);// to invoke the imidiate parent class parameterised constructor.
System.out.println("Three class");
}
}
class SuperEx{
public static void main(String ar[]){
//Two o=new Two();
Three t=new Three();
}
}