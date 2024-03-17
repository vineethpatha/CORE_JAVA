class FinalOutput2
{
static int input1;
static int input2;
static int sum;
static int sub;
static int mul;
static int div;
static int mod;
public static void main(String[] abc)
{

input1=15;
input2=30;
add();
mul();
sub();
div();
mod();

System.out.println(sum);
System.out.println(sub);
System.out.println(mul);
System.out.println(div);
System.out.println(mod);

}
static int add()

{
sum=input1+input2;
return sum;
}
static int sub()
{
sub=input1-input2;
return sub;
}
static int mul()
{
mul=input1*input2;
return mul;
}
static int div()
{
div=input1/input2;
return div;
}
static int mod()
{
mod=input1%input2;
return mod;
}
}





