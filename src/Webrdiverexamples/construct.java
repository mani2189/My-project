package Webrdiverexamples;

public class construct
{
int a;
String b;
    public construct(){
	  a=10;
	  b="june";
	}
public construct(int a ,String b){
this.a=a;
this.b=b;  
}	
public static void main(String[] args)
{
construct obj1 =new construct();
construct obj2 =new construct(1,"java");
System.out.println(obj1.a);
System.out.println(obj2.a);
System.out.println(obj2.b);


	
}
}