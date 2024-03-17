class Biggest{

public static void main(String[] abc){

int a=Integer.parseInt(abc[0]);
int b=Integer.parseInt(abc[1]);
int c=Integer.parseInt(abc[2]);

if(a>b && a>c)
System.out.println(a+ "is bigger");
if(b>a && b>c)
System.out.println(b+ "is bigger");
if(c>a && c>b)
System.out.println(c+ "is bigger");




}
}