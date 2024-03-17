import java.util.*;
class NestedIf{
public static void main(String[] args){

Scanner sc =new Scanner(System.in);
System.out.println("enter value a");
int a=sc.nextInt();
System.out.println("enter value b");
int b=sc.nextInt();
System.out.println("enter value c");
int c=sc.nextInt();



if(b!=0){ //if block 1 
  if(c>b)
  System.out.println("c is bigger than b");//printed
  if(a>b)
  System.out.println("a is bigger than b");
}

if(a==0){ //inthis condition the both conditions are false than it goes else 2
if(a>b){
System.out.println("a is bigger than b");
}
else
System.out.println("b is bigger than a");
}

else{
if(c!=0){
System.out.println("c is greater than two numbers");//printed
}
}

if(a!=0 && b!=0){ //this condition true
if(a>b){
System.out.println("a is bigger than b");
}
else
System.out.println("b is bigger than a"); //printed 
}

else if(b>a){
if(b>a){
System.out.println("b is bigger than a");
System.out.println("20 is bigger than 10");
}
}
else
System.out.println("both are not equal");

//continue the program



}










}