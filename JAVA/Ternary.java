class Ternary{
public static void main(String[] args){

int a=10,b=20,c=50,d,e,f;
String h,g;

d=(b>a)?b:a;
System.out.println("c is bigger");
System.out.println(c);

e=(b>a)&&(c>b)?b:a;
System.out.println("c is bigger");

f=(b>a)&&(a>c)?c:b;
System.out.println(f);

h=(a>b)?("a is bigger"):("b is bigger");
System.out.println(h);


g=(a>b)?((b>c)?"c is bigger":"b is smaller")   : ( (c>a) ? ((a%2==0)?"a is even a":"a is not EVEN") : "A IS SMALLER"   )  ;
System.out.println(g);


//g=(a>b)?((b>c)?"c is bigger":"b is smaller"):((c>a)?(a%2==0)?"c is greater than a":"a is //EVEN"):"A IS SMALLER");


}
}



