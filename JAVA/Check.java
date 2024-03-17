class Check{
public static void main(String[] args){

Test obj=new Test();
obj.methodtwo();//0
System.out.println(obj.d);//0
obj.methodone();//50
System.out.println(obj.d);//0

System.out.println(obj.c);
}
}