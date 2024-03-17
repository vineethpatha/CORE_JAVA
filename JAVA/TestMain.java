class TestMain{

static StaticMain obj=new StaticMain();
TestMain testMain=new TestMain();

static int a=500,b=250;

public static void main(String[] args){

//StaticMain obj=new StaticMain();
//TestMain testMain=new TestMain();

System.out.println(obj.a);
System.out.println(b);
obj.methodtwo();

}
}
