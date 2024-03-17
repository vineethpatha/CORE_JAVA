class Leapyear{

public static void main(String[] abc){

int a=Integer.parseInt(abc[0]);

if(a%4==0&&a%100!=0||a%400==0)
System.out.println("given year is leap year");
else
System.out.println("given year is not leap year");

}
}