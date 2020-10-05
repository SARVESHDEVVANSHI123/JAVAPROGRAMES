class One{
One(){
System.out.println("One class");
}
}
class Two extends One{
Two(){
System.out.println("Two class");
}
}
class SuperEx{
public static void main(String ar[]){
Two o=new Two();
}
}